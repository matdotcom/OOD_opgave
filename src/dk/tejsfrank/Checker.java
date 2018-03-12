package dk.tejsfrank;

public class Checker {
    boolean checkerLogin(String brugernavn, String  password){
        int k=0;

        for (int i = 0; i < DB_ArrayList.arrayAfAlleStuderende.size() ; i++) {
            if(DB_ArrayList.arrayAfAlleStuderende.get(i).getBrugernavn().equals(brugernavn)){
                k=i;
            }

        }

        if(DB_ArrayList.arrayAfAlleStuderende.get(k).getKodeord().equals(password)){
            return true;
        }else{
            return  false;
        }
    }

}
