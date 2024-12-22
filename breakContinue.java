public class breakContinue {

    public static  void main(String[] args){
        for (int i = 0; i <= 20 ; i+= 2) {
            System.out.println(i);
            if(i >= 12) break;
        }

        for (int i = 10; i <=30; i += 5){
            if(i==15 || i == 25) continue; // skip 20
            System.out.println(i);

        }
    }

}
