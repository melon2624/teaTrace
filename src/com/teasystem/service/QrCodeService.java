package com.teasystem.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

//溯源二维码生产服务
public class QrCodeService {

	public static BitMatrix encode(String content) throws WriterException, IOException {
		
		int width = 300; // 图像宽度
		int height = 300; // 图像高度

		Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
		hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
		//调用第三方包进行编码
		BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);// 生成矩阵

		return bitMatrix;
		
	}

	public static void download(HttpServletRequest request, HttpServletResponse response) {
		try {

			// BufferedReader reader = request.getReader();
			// String input = null;
			// StringBuffer requestBody = new StringBuffer();
			// while ((input = reader.readLine()) != null) {
			// requestBody.append(input);
			// }
			//
			// String params = requestBody.toString();

			// String params = "{'data': [{'code': '1234567890'},{'code': 'Anna'},{'code':
			// 'Peter'}]}";

			String params = request.getParameter("array");

			if (params != null && params.length() > 0) {
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
				String time = sdf.format(date);

				String downloadFilename = "QrCode_" + time + ".zip";// 文件的名称
				downloadFilename = URLEncoder.encode(downloadFilename, "UTF-8");// 转换中文否则可能会产生乱码
				response.setContentType("application/octet-stream");// 指明response的返回对象是文件流
				response.setHeader("Content-Disposition", "attachment;filename=" + downloadFilename);// 设置在下载框默认显示的文件名

				ZipOutputStream zos = new ZipOutputStream(response.getOutputStream());

				// System.out.println(":"+params+":");
				JSONArray json = JSON.parseObject(params).getJSONArray("data");
				for (int i = 0; i < json.size(); i++) {
					// 遍历 jsonarray 数组，把每一个对象转成 json 对象
					JSONObject job = json.getJSONObject(i);
					// 得到 每个对象中的属性值
					String str = job.getString("code");
					if (str != null) {
						zos.putNextEntry(new ZipEntry("teatrace_" + str + ".png"));
						//输出到压缩文件输出流
						MatrixToImageWriter.writeToStream(encode(str), "png", zos);
						zos.flush();
					}
				}
				zos.flush();
				zos.close();
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (WriterException e) {
			e.printStackTrace();
		}
	}
}
