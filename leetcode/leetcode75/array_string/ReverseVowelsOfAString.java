package leetcode.leetcode75.array_string;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s){
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length -1;
        String vowels = "auieoAUIEO";
        while (left < right){
            while (left < right){
                char ch = arr[left];
                if(vowels.indexOf(ch) != -1){
                    break;
                }
                left++;
            }

            while(left < right){
                char ch = arr[right];
                if(vowels.indexOf(ch) != -1){
                    break;
                }
                right--;
            }
            if(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        }
        return new String(arr);
    }

    public String solution2(String s){
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length -1;

        while(left < right){
            while(left < right && !isVowels(chars[left])) {
                left++;
            }
            while(left < right && !isVowels(chars[right])){
                right--;
            }
            if(left >= right ){
                break;
            }
            if(left < right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }


    public boolean isVowels(char c){
        return c =='u'|| c =='e'|| c== 'o' || c=='a'|| c== 'i' ||
                c=='U' || c =='E'|| c== 'O' || c=='A'|| c== 'I';
    }


    public static void main(String[] args) {
        System.out.println(new ReverseVowelsOfAString().reverseVowels("hello"));
        System.out.println(new ReverseVowelsOfAString().solution2("hello"));

    }
}
