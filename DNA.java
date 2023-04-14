public class DNA{
    public static boolean ProteinVerifier (String dna){
        if (dna.indexOf("ATG") == 0 && dna.indexOf("TGA") == 12){
            String proteina = dna.substring(3, 12);
                if (proteina.length() %3 == 0){
                    System.out.println(proteina);
                }else{
                    System.out.println("Nao ha proteína");
                }return false;
            }else{
                System.out.println("Nao é verificavel");
            }return false;
        } 
        public static void main(String []args){
        String dna1 = "ATGCGATACGCTTGA" ;
        String dna2= "ATGCGATACGTGA";
        String dna3= "ATTAATATGTACTGA";
        System.out.println(dna1.length());
        System.out.println(dna1.indexOf("ATG"));
        System.out.println(dna1.indexOf("TGA"));
        DNA.ProteinVerifier(dna1);
        DNA.ProteinVerifier(dna2);
        DNA.ProteinVerifier(dna3);
    }
}



