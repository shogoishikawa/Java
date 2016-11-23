import java.io.*;

public class GetPrimeFactor{
    public static void main(String[] args){
        String filename = "list";
        try(BufferedReader in = new BufferedReader(new FileReader(new File(filename)))){
            String line;
            while((line = in.readLine()) != null){
                int num = new Integer(line);
                int remainder_num;
                StringBuilder result_factor = new StringBuilder();
                int count = 2;
                
                result_factor.append(num + ",");
                
                while(num != 1){
                    remainder_num = num % count;
                    if(remainder_num == 0){
                        result_factor.append(count);
                        if( (num / count) != 1){
                            result_factor.append(",");
                        }
                        num /= count;
                        count = 2;
                    }else{
                        count++;
                    }
                }
                    System.out.println(result_factor);
            }
        }catch(FileNotFoundException e){
            System.out.println("FileNotFount!");
        }catch(NumberFormatException e){
            System.out.println("数値無効");
        }catch(IOException e){
            e.printStackTrace();
        }
    }   
}
