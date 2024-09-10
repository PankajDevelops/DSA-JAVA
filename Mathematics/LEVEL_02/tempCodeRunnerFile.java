for(String s:arr){
            if(!s.equals("0")){
                isAllZero = false;
                break;
            }
        }

        if(isAllZero){
            System.out.println("0");
            return;
        }