public class DNA {
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna;
    public DNA(int dnaType){
        if(dnaType == 1){
            dna = dna1;
        }else if(dnaType == 2){
            dna = dna2;
        }else {
            dna = dna3;
        }
    }
    public String dnaCheck(){
        int dnaLength = dna.length();
        int dnaStart = dna.indexOf("ATG");
        int dnaEnd = dna.indexOf("TGA");
        int newDnaStart = dnaStart + 3;
        int proteinCount = dnaEnd - newDnaStart;
        int proteinCheck = proteinCount % 3;
        if(dnaStart != -1 && newDnaStart > 0 && dnaEnd != -1 && proteinCheck == 0){
            String Pass = "Protein";
            return Pass;
        }else {
            String Pass = "Not a Protein";
            return Pass;
        }



    }

    public static void main(String[] args){

        DNA type1 = new DNA(1);
        System.out.println(type1.dna);
        System.out.println(type1.dnaCheck());
        DNA type2 = new DNA(2);
        System.out.println(type2.dnaCheck());
    }
}
