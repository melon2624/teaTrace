package com.teasystem.service;

import java.util.ArrayList;
import java.util.List;

import com.teasystem.entity.TreeFertilize;
import com.teasystem.service.TreeFertilizeService;


public class GetTreeFertHistory {
	
	public static List<TreeFertilize> getFertHistory(List<Integer> farmidlist)
	{
		List<TreeFertilize> tftl=new ArrayList<TreeFertilize>();
		int farmid;
		
		if(farmidlist!=null)
		{
			for (int i = 0; i < farmidlist.size(); i++) 
			{
				farmid=farmidlist.get(i);	//从list中取得每个施肥农事编号
				
				TreeFertilizeService tfs=new TreeFertilizeService();
				TreeFertilize treeFertilize=tfs.getTreeFertilizeByIdService(String.valueOf(farmid));
				
				if(treeFertilize!=null)
				{
					tftl.add(treeFertilize);
				}
			}
			return tftl;
		}
		return null;
	}
}
