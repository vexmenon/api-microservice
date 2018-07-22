package com.candidate.api.util;



import java.util.*;

public class StringUtil {

	public static Integer convertStringToInteger(String strObj) {
		
		Integer iObj = null;
		try {
			iObj = Integer.parseInt(strObj);
		} catch (NumberFormatException e) {
		} catch (NullPointerException e) {
        }
		return iObj;
	}
	

	public static String getIndexValueFromArray(String[] array, int index) {
		if (array!=null && index<array.length) {
			return array[index];
		} else {
			return null;
		}
	}

	public static boolean isStringNull(String strObj){
		if(strObj == null){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isNullOrBlank(String strObj) {
		if (strObj==null || ( null !=strObj &&  "".equals(strObj.trim()))) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isVaildMandatoryString(String strObj, int length) {
		
		if (isNullOrBlank(strObj)) {
			return false;
		}
		
		if (strObj.length() > length) {
			return false;
		}
		return true;
	}

	public static boolean isVaildOptionalString(String strObj, int length) {
		
		if (!isNullOrBlank(strObj)) {
			if (strObj.length() > length) {
				return false;
			}
		}
		return true;
	}

    public static boolean isVaildMandatoryStringList(List<String> strListObj, int length) {

        if (strListObj==null || strListObj.size()<1) {
            return false;
        }
        for(String strObj:strListObj){
            if (isNullOrBlank(strObj) || strObj.length() > length) {
                return false;
            }
        }

        return true;
    }

	public static boolean isVaildOptionalStringList(List<String> strListObj, int length) {
		if (strListObj != null && strListObj.size() > 0) {
			for(String strObj:strListObj){
				if (isNullOrBlank(strObj) || strObj.length() > length) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	Method will add script or css styles before or after html
	 */
	public static String appendStringFromStringArray(StringBuffer content,String stringArrayToAppend[],boolean isBeforeString,  	boolean isScript){
		if(stringArrayToAppend!=null && stringArrayToAppend.length >0){
			if(isScript){
				for(String n : stringArrayToAppend){
					n = createScriptTag(n);
					if(isBeforeString){
						content.insert(0,n);
					}else{
						content.append(n).append(System.lineSeparator());
					}
				}
			}else{
				StringBuffer strBuffer = new StringBuffer();
				for(String n : stringArrayToAppend){
					n = createCssStyle(n);
					strBuffer.append(n);
					if(!isBeforeString){
						content.append(n).append(System.lineSeparator());
					}
				}
				if(isBeforeString){
					content.insert(0,strBuffer.toString()).append(System.lineSeparator());
				}

			}

		}
		return content.toString();

	}
    
    public static String normalizeDateString(String obj) {

    	if(!isNullOrBlank(obj) && obj.length() > 1) {
    		return obj.substring(1, obj.length()-1);
    	}
    	return null;
    }

	public static boolean isNumeric(String str) {
		if(str == null) {
			return false;
		} else {
			int sz = str.length();

			for(int i = 0; i < sz; ++i) {
				if(!Character.isDigit(str.charAt(i))) {
					return false;
				}
			}

			return true;
		}
	}

	public static String createScriptTag(String srcValue){
		String script = "<script src="+srcValue+"></script>";
		return 	script;
	}

	public static String createCssStyle(String srcValue){
		String styleTag = "<link href="+srcValue+" rel=\"stylesheet\" type=\"text/css\"/>";
		return 	styleTag;
	}


    public static String convertStringListToStringWithSeparator(List<String> stringList, String separator) {
        String finalString = "";
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                finalString = stringList.get(i);
            } else {
                finalString = finalString + separator + stringList.get(i);
            }
        }
        return finalString;
    }

    public static String convertCommaSeperatedStringToSqlSearch(String commaSeperated,String delimiter){
		ArrayList<String> stringList = null;
		StringBuffer stringBuffer = new StringBuffer();
		switch(delimiter){
			case ",":
				stringList = new ArrayList<String>(Arrays.asList(commaSeperated.split(",")));
				break;
			case "|":
				stringList = new ArrayList<String>(Arrays.asList(commaSeperated.split("|")));
				break;
		}

		for(String s : stringList){
			stringBuffer.append("'" + s + "'").append(",");
		}
		String value  = stringBuffer.toString().replaceAll(", $", "");
		value = value.substring(0, value.length()-1);
		return value;

	}

	public static String findAndReplace(String textToFormat,String textToReplaceWith,String textToReplace){
    	return textToFormat.replace(textToReplace,textToReplaceWith);

	}



    public static ArrayList<Integer> convertDelimitedStringToIntegerList(String commaSeperatedString, String delimiter){
		ArrayList<Integer> listOfValues = new ArrayList<>();
		ArrayList<String> stringList = null;
		switch(delimiter){
			case ",":
				stringList = new ArrayList<String>(Arrays.asList(commaSeperatedString.split(",")));
				break;
			case "|":
				stringList = new ArrayList<String>(Arrays.asList(commaSeperatedString.split("|")));
				break;
		}
		for(String s : stringList){
			listOfValues.add(Integer.parseInt(s));
		}
		return listOfValues;



	}






}
