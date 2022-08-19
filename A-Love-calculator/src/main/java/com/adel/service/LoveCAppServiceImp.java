package com.adel.service;

import org.springframework.stereotype.Service;

@Service
public class LoveCAppServiceImp implements LoveCAppService{

	public final String lCAppFormula = "FLAME";
	
	@Override
	public String calculateLove(String name , String crushName) {

		int userAndCrushName = (name+crushName).toCharArray().length;
		int formulaCount = lCAppFormula.toCharArray().length;
		
		int rem = userAndCrushName % formulaCount;
		
		char resultChar = lCAppFormula.charAt(rem);
		
		String result = whatsBetweenUs(resultChar);
		return result;
	}

	@Override
	public String whatsBetweenUs(char calculationResult) {
		
		String result = null ;
		if(calculationResult == 'F')
		{
			result = LoveCalculatorConstants.F_CHAR_MEANING;
		}
		else if(calculationResult == 'L')
		{
			result = LoveCalculatorConstants.L_CHAR_MEANING;
		}
		else if(calculationResult == 'A')
		{
			result = LoveCalculatorConstants.A_CHAR_MEANING;
		}
		else if(calculationResult == 'M')
		{
			result = LoveCalculatorConstants.M_CHAR_MEANING;
		}
		else if(calculationResult == 'E')
		{
			result = LoveCalculatorConstants.E_CHAR_MEANING;
		}
		
		return result;
	}
}
