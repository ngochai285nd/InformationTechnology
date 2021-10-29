public class Student {
    // filed attributes
    private int assign1, assign2, assign3, assign4;
    private int lab1, lab2;
    private int exam1, exam2;
    private double pracAverage, examAverage, finalMark;
    private boolean passedHurdle = true;

    // methods
    public void setAssign1(int assign1) {
        this.assign1 = assign1;
    }

    public void setAssign2(int assign2) {
        this.assign2 = assign2;
    }

    public void setAssign3(int assign3) {
        this.assign3 = assign3;
    }

    public void setAssign4(int assign4) {
        this.assign4 = assign4;
    }

    public void setLab1(int lab1) {
        this.lab1 = lab1;
    }

    public void setLab2(int lab2) {
        this.lab2 = lab2;
    }

    public void setExam1(int exam1) {
        this.exam1 = exam1;
    }

    public void setExam2(int exam2) {
        this.exam2 = exam2;
    }

    public void isPassAssignLab() {
        pracAverage = (assign1 + assign2 + assign3 + assign4 + lab1 + lab2) / 6.0;
        if (pracAverage >= 50) {
            System.out.println("Passed assignment/lab hurdle!");
        } else {
            passedHurdle = false;
            System.out.println("Failed assignment/lab hurdle!");
        }
    }

    public void isPassExam() {
        if ((exam1 >= 40) && (exam2 >= 40)) {
            System.out.println("Passed exam hurdle!");
        } else {
            passedHurdle = false;
            System.out.println("Failed exam hurdle!");
        }
    }

    public void isPassOverall() {
        examAverage = (exam1 + exam2) / 2.0;
        finalMark = 0.3 * pracAverage + 0.7 * examAverage;
        System.out.println("Final mark is " + finalMark + "%");
        if ((finalMark >= 50) && (passedHurdle == true)) {
            System.out.println("Passed overall.");
        } else {
            System.out.println("Failed overall.");
        }
    }
}
