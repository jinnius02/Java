package com.ureca;

public class NameMenu {
   //데이터에 대한 CRUD
	
   //데이터 저장소	
   String []names=new String[5];	
//   String []names= {null,null,null,null,null};	
   
   void create(String name){
	  for(int i=0; i<names.length; i++) {
		 if(names[i] == null){//빈곳 찾기 
	       names[i]=name;
	       break;
		 }
	  }//for
	  
   }//create
   
   
   String[] read(){
	   return names;
   }
   
   
   void update(String oldName ,String newName ){
	   
	   for(int i=0; i<names.length; i++) {
//		   if(names[i] == oldName) {//변경할 이름을 찾았다면
		   //==> String메모리 주소 비교
		   
		   if(names[i].equals(oldName)) {//변경할 이름을 찾았다면
		   //==> String(문자열) 내용 비교
			   names[i] = newName;
			   break;
		   }
	   }//for
	   
   }//update
   
   
   void delete(String delName){
	   for(int i=0; i<names.length; i++) {
		   
		   if(names[i].equals(delName)) {//삭제할 이름을 찾았다면
		   //==> String(문자열) 내용 비교
			   names[i] = null;
			   break;
		   }
	   }//for	   
   }
   
}