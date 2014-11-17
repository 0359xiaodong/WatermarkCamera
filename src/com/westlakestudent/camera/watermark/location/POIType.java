package com.westlakestudent.camera.watermark.location;

public enum POIType {
	
	PLACE("�ص�", 0), AGENCY("����,��������", 1), EDUCATION("����", 2), ENTERTAINMENT("��������", 3), FOOD("����", 4), 
	HOTEL("����,�ز�С��,����,����", 5), HOSPITAL("ҽ��", 6), LIFE("�������", 7), OFFICE("��˾��ҵ", 8), SHOP("����", 9), 
	TRAFFIC("��ͨ", 10), TRAVEL("���ξ���", 11), COLLECT("", 12);
		
	private String mName;  
    private int mId;  
      
    private POIType(String name, int id) {  
        mName = name;  
        mId = id;  
    }  
    
    public static String getName(int index) {  
        for (POIType poi : POIType.values())  
            if (poi.getID() == index) 
                return poi.mName;                
          
        return null;  
    }  
    
    public static POIType getType(String typeName) {  
        for (POIType poi : POIType.values()) 
            if (poi.getName().contains(typeName))
                return poi;              
         
        return POIType.PLACE;  
    } 
    
    public String getName() {  
        return mName;  
    }  
    
    public void setName(String name) {  
        mName = name;  
    }  
    
    public int getID() {  
        return mId;  
    }  
    
    public void setID(int id) {  
        mId = id;  
    }
}
