 class AddStrings {
 
      public String addStrings(String num1, String num2) {
           
            int i = num1.length() - 1;
            int j = num2.length() - 1;
            int carry = 0;
            char[] num1Array = num1.toCharArray();
            char[] num2Array = num2.toCharArray();
            StringBuilder sb = new StringBuilder();
            
             while (i >= 0 || j >= 0 || carry == 1) {
                int a = i >= 0 ? (num1Array[i--] - '0') : 0;
                int b = j >= 0 ? (num2Array[j--] - '0') : 0;
                int sum = a + b + carry;
                sb.insert(0, sum % 10);
                carry = sum / 10;
            }
            return sb.toString();
            
        }
    }  

