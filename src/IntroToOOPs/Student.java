package IntroToOOPs;

public class Student {
    public String name;
    int age;                                    //here, we haven't specified any modifier so default is 'default'
    int gradYear;
    private int psp;

    public Student(){
        name = "new name";
        age = 100;
        gradYear = 1999;
        psp = 100;
    }
                                        //we are generating getter() & setter() for 'psp' BCZ 'psp' is private. with getter setters we can access it
    public int getPsp() {
        return psp;
    }

    public void setPsp(int pspVar) {
        if(pspVar < 0 || pspVar > 100){
            throw new RuntimeException("Invalid PSP....");
        }

        psp = pspVar;
    }

    void attendClass(){
        System.out.println("Student " + name + " is attending class");
    }
}


/* IMP Pointer-
1. We can never mark class as 'private'.
2. 'default' modifier accessible withing same pkg
3. 'private' modifier accessible withing same file
4. 'protected' modifier accessible withing same pkg + children anywhere
*/
