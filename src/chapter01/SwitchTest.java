package chapter01;

public class SwitchTest {

	public static void main(String[] args) {
		int month = 12;
		int days = 0;
		
//		if( month ==1 ) {//1.
//			days = 31;
//	    } else if (month == 2) {
//	    	days = 28;
//	    } else if (month == 3 ) {
//	    	days = 31;
//	    } else if (month == 4 ) {
//	    	days = 30;
//	    } else if (month == 5 ) {
//	    	days = 31;
//	    } else if (month == 6 ) {
//	    	days = 3;
//	    } else if (month == 7 ) {
//	    	days = 31;
//	    } else if (month == 8 ) {
//	    	days = 31;
//	    } else if (month == 9 ) {
//	    	days = 30;
//	    } else if (month == 10 ) {
//	    	days = 31;
//	    } else if (month == 11 ) {
//	    	days = 30;
//	    } else if (month == 12 ) {
//    		days = 31;
//	    }
//		System.out.println(month + "월은 " + days  +"일 까지 있습니다.");
//		if ( month == 1 ||  //2.
//			month == 3 ||
//			month == 5 ||
//			month == 7 || 
//			month == 8 || 
//			month == 10 || 
//			month == 12) {
//		    days = 31;
//		} else if (month == 2) {
//			days = 28;
//		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
//			days = 30;
//		}
//		switch(month) {//3. break 를 안쓰면 오류남 , case 문을 계쏙 수행하기때문, if 문보단 보기 편해짐
//			case 1: { //cast는 무조건 = 임 다른 건 안됨 >, < 라던가
//				days = 31;
//				break;
//			}
//			case 2: {
//				days = 28;
//				break;
//			}
//			case 3: {
//				days = 31;
//				break;
//			}
//			case 4: {
//				days = 30;
//				break;
//			}
//			case 5: {
//				days = 31;
//				break;
//			}
//			case 6: {
//				days = 30;
//				break;
//			}
//			case 7: {
//				days = 31;
//				break;
//			}
//			case 8: {
//				days = 31;
//				break;
//			}
//			case 9: {
//				days = 30;
//				break;
//			}
//			case 10: {
//				days = 31;
//				break;
//			}
//			case 11: {
//				days = 30;
//				break;
//			}
//			case 12: {
//				days = 31;
//				break;
//			}
//			default : {
//				days = 0;
//				break;
//			}
//		}
		switch(month) {//3. break 를 안쓰는 것을 이용한 것
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:{
			days = 31;
			break;
		}
		case 2: {
			days = 28;
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11:{
			days = 30;
			break;
		}
		default : {
			days = 0;
			break;
		}
		}
		System.out.println(month + "월은 " + days  +"일 까지 있습니다.");
	}
 } 