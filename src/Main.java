import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        User Andrey = new User(835162780, "Andrey", "Sanerko", 1000);
        User Dmytro = new User(835182780, "Dmytro", "raterko", 1960);
        User Vasya = new User(845162780, "Vasya", "kanerto", 9000);
        User Kostya = new User(835162080, "Kostya", "defuzenko", 1000);
        IDMoney(Andrey);
        transfer(Andrey,Vasya,50);


    }

        public static void IDMoney(User user){
            System.out.println("На рахунку " + user.sum);
        }

        public static void transfer(User fromUser,User toUser,int countOfMoney){
            toUser.sum = toUser.sum+countOfMoney;
            fromUser.sum = fromUser.sum-countOfMoney;
        }



}
