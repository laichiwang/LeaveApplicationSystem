public class Lab3 {

    public static void main(String[] args) {
        Staff[] peoples = new Staff[100];
        String nameList = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 100; i++) {
            peoples[i] = new Staff();
            peoples[i].setName(nameList.charAt(i % 52));
            if (i % 2 == 0) {
                peoples[i].setAge(30);
            } else {
                peoples[i].setAge(40);
            }

            if (i < 50) {
                peoples[i].setGender('M');
            } else {
                peoples[i].setGender('F');
            }

            if (peoples[i].getAge() == 30 && peoples[i].getGender() == 'F') {
                peoples[i].setTitle("Ms.");
            } else if (peoples[i].getGender() == 'F') {
                peoples[i].setTitle("Mrs.");
            } else {
                peoples[i].setTitle("Mr.");
            }
        }

        for (int i = 0; i < 99; i++) {
            peoples[i].greeting(peoples[i+1]);
        }
        peoples[99].greeting(peoples[0]);
    }
}
