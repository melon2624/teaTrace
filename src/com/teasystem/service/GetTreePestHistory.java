package com.teasystem.service;

import java.util.ArrayList;
import java.util.List;

import com.teasystem.entity.TreePesticide;

public class GetTreePestHistory {
	
	public static List<TreePesticide> getPestHistory(List<Integer> farmidlist)
	{
		List<TreePesticide> tptl=new ArrayList<TreePesticide>();
		int farmid;
		
		if(farmidlist!=null)
		{
			for (int i = 0; i < farmidlist.size(); i++) 
			{
				farmid=farmidlist.get(i);	//从list中取得每个施肥农事编号
				
				TreePesticideService tps=new TreePesticideService();
				TreePesticide treePesticide=tps.getTreePesticideByIdService(String.valueOf(farmid));
				
				if(treePesticide!=null)
				{
					tptl.add(treePesticide);
				}
			}
			return tptl;
		}
		return null;
	}
}
