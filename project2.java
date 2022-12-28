import java.util.*;

public class project2 {
    int a, b, c, d, e, f, g, s, s1, i, j;
    String str1;
    Scanner sc = new Scanner(System.in);

    project2() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        s = 0;
        s1 = 0;
        i = 0;
        j = 0;
        g = 0;
        str1 = "";
    }

    public void rsp(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.println("Enter either 1 for  rock,2 for paper or 3 for scissors");
            b = sc.nextInt();
            a = (int) (Math.random() * 2) + 1;
            {
                if (a == 1)
                    str1 = "Rock";
                if (a == 2)
                    str1 = "Paper";
                if (a == 3)
                    str1 = "Scissors";
            }
            if (b == 1) {
                if (a == 1)
                    System.out.println("Rock vs " + str1 + "!Its a draw");
                if (a == 2)
                    System.out.println("Rock vs " + str1 + "!Paper wins");
                if (a == 3)
                    System.out.println("Rock vs " + str1 + "!Rock wins");
            } else if (b == 2) {
                if (a == 1)
                    System.out.println("Paper vs " + str1 + "!Paper wins");
                if (a == 2)
                    System.out.println("Paper vs  " + str1 + "!Its a draw");
                if (a == 3)
                    System.out.println("Paper vs  " + str1 + "!Scissors wins");
            } else if (b == 3) {
                if (a == 1)
                    System.out.println("Scissors vs  " + str1 + "!Rock wins");
                if (a == 2)
                    System.out.println("Scissors vs  " + str1 + "!Scissors wins");
                if (a == 3)
                    System.out.println("Scissors vs  " + str1 + "!Its a draw");
            } else
                System.out.println("No such option exists");
        }
    }

    public void cricket() {
        int m[] = new int[10];
        int n[] = new int[10];
        int p[] = new int[10];
        int q[] = new int[10];
        System.out.println("You have chosen to play cricket");
        System.out.println("Gear up for the toss");
        System.out.println("Enter 1 for heads");
        System.out.println("Enter 2 for tails");
        a = sc.nextInt();
        b = (int) (Math.random() * 2);
        if (b == a) {
            System.out.println("You have won the toss");
            System.out.println("To bat,enter 1");
            System.out.println("To bowl,enter 2");
            c = sc.nextInt();
            if (c == 1) {
                System.out.println("You have chosen to bat");
                System.out.println("You will get ten deliveries to play");
                System.out.println("You get only one wicket");
                System.out.println("You can enter numbers between 1 to 6");
                System.out.println("The computer too,will randomize numbers between 1 to 6");
                System.out.println(
                        "If your entered number equals the computer's guess,then you have lost your only wicket");
                System.out.println("Enter numbers between 1 to 6");
                for (i = 0; i < 10; i++) {
                    m[i] = sc.nextInt();
                    if (m[i] > 6) {
                        System.out.println("Sorry!Only numbers from 1 to 6 allowed!");
                        break;
                    }
                    n[i] = (int) (Math.random() * 6) + 1;
                    System.out.println("You entered " + m[i] + " while the computer entered " + n[i]);
                    if (n[i] == m[i]) {
                        System.out.println("You are out!");
                        break;
                    }
                    s = s + m[i];
                }
                System.out.println("Your final score is " + s);
                System.out.println("The computer shall now bat");
                System.out.println("The computer will also get ten deliveries");
                System.out.println(
                        "Enter numbers between 1 to 6,anf if one of them equals the computer's number,you will get its only wicket");
                System.out.println("Enter numbers between 1 to 6");
                for (i = 0; i < 10; i++) {
                    p[i] = (int) (Math.random() * 6) + 1;
                    q[i] = sc.nextInt();
                    if (q[i] > 6) {
                        System.out.println("Sorry!Only numbers from 1 to 6 allowed!");
                        break;
                    }
                    System.out.println("The computer entered " + p[i] + " while you entered " + q[i]);
                    if (p[i] == q[i]) {
                        System.out.println("The computer is out!");
                        break;
                    }
                    s1 = s1 + p[i];
                    if (s1 > s) {
                        break;
                    }
                }
                System.out.println("The computer scored " + s1);
                if (s == s1)
                    System.out.println("Its a draw");
                if (s1 > s)
                    System.out.println("The computer wins");
                if (s1 < s)
                    System.out.println("You win");
            }
            if (c == 2) {
                System.out.println("You have chosen to bowl");
                System.out.println("You will get ten deliveries to play");
                System.out.println("The computer will get only  one wicket");
                System.out.println("You can enter numbers between 1 to 6");
                System.out.println("The computer too,will randomize numbers between 1 to 6");
                System.out.println(
                        "If the computer's number equals your entered number,then the computer has lost its only wicket");
                System.out.println("Enter numbers between 1 to 6");
                for (i = 0; i < 10; i++) {
                    p[i] = (int) (Math.random() * 6) + 1;
                    q[i] = sc.nextInt();
                    if (q[i] > 6) {
                        System.out.println("Sorry!Only numbers from 1 to 6 allowed!");
                        break;
                    }
                    System.out.println("The computer entered " + p[i] + " while you entered " + q[i]);
                    if (p[i] == q[i]) {
                        System.out.println("The computer is out!");
                        break;
                    }
                    s1 = s1 + p[i];
                }
                System.out.println("The computer scored " + s1);
            }
            System.out.println("You shall now bat");
            System.out.println("You will also get ten deliveries");
            System.out.println(
                    "Enter numbers between 1 to 6,and if one of them equals the computer's number,you will lose your only wicket");
            System.out.println("Enter numbers between 1 to 6");
            for (i = 0; i < 10; i++) {
                m[i] = sc.nextInt();
                if (m[i] > 6) {
                    System.out.println("Sorry!Only numbers from 1 to 6 allowed!");
                    break;
                }
                n[i] = (int) (Math.random() * 6) + 1;
                System.out.println("You entered " + m[i] + " while the computer entered " + n[i]);
                if (n[i] == m[i]) {
                    System.out.println("You are out!");
                    break;
                }
                s = s + m[i];
                if (s > s1) {
                    break;
                }
            }
            System.out.println("Your final score is " + s);
            if (s == s1)
                System.out.println("Its a draw");
            if (s1 > s)
                System.out.println("The computer wins");
            if (s1 < s)
                System.out.println("You win");
        }
        if (b != a) {
            System.out.println("You have lost the toss");
            c = (int) (Math.random() * 2);
            if (c == 0) {
                System.out.println("The computer has chosen to bat");
                System.out.println("It will get ten deliveries to play");
                System.out.println("The computer will get only one wicket");
                System.out.println("You can enter numbers between 1 to 6");
                System.out.println("The computer too,will randomize numbers between 1 to 6");
                System.out.println(
                        "If the computer's number equals your entered number,then the computer has lost its only wicket");
                System.out.println("Enter numbers between 1 to 6");
                for (i = 0; i < 10; i++) {
                    p[i] = (int) (Math.random() * 6) + 1;
                    q[i] = sc.nextInt();
                    if (q[i] > 6) {
                        System.out.println("Sorry!Only numbers from 1 to 6 allowed!");
                        break;
                    }
                    System.out.println("The computer entered " + p[i] + " while you entered " + q[i]);
                    if (p[i] == q[i]) {
                        System.out.println("The computer is out!");
                        break;
                    }
                    s1 = s1 + p[i];
                }
                System.out.println("The computer scored " + s1);
                System.out.println("You shall now bat");
                System.out.println("You will also get ten deliveries");
                System.out.println(
                        "Enter numbers between 1 to 6,and if one of them equals the computer's number,you will lose your only wicket");
                System.out.println("Enter numbers between 1 to 6");
                for (i = 0; i < 10; i++) {
                    m[i] = sc.nextInt();
                    if (m[i] > 6) {
                        System.out.println("Sorry!Only numbers from 1 to 6 allowed!");
                        break;
                    }
                    n[i] = (int) (Math.random() * 6) + 1;
                    System.out.println("You entered " + m[i] + " while the computer entered " + n[i]);
                    if (n[i] == m[i]) {
                        System.out.println("You are out!");
                        break;
                    }
                    s = s + m[i];
                    if (s > s1) {
                        break;
                    }
                }
                System.out.println("Your final score is " + s);
                if (s == s1)
                    System.out.println("Its a draw");
                if (s1 > s)
                    System.out.println("The computer wins");
                if (s1 < s)
                    System.out.println("You win");
                if (c == 1) {
                    System.out.println("The computer has chosen to bowl");
                    System.out.println("You will get ten deliveries to play");
                    System.out.println("You will get only  one wicket");
                    System.out.println("You can enter numbers between 1 to 6");
                    System.out.println("The computer too,will randomize numbers between 1 to 6");
                    System.out.println(
                            "If your entered number equals the computer's number,then you have lost your only wicket");
                    System.out.println("Enter numbers between 1 to 6");
                    for (i = 0; i < 10; i++) {
                        m[i] = sc.nextInt();
                        if (m[i] > 6) {
                            System.out.println("Sorry!Only numbers from 1 to 6 allowed!");
                            break;
                        }
                        n[i] = (int) (Math.random() * 6) + 1;
                        System.out.println("You entered " + m[i] + " while the computer entered " + n[i]);
                        if (n[i] == m[i]) {
                            System.out.println("You are out!");
                            break;
                        }
                        s = s + m[i];
                    }
                    System.out.println("Your final score is " + s);
                    System.out.println("The computer shall now bat");
                    System.out.println("The computer will also get ten deliveries");
                    System.out.println(
                            "Enter numbers between 1 to 6,anf if one of them equals the computer's number,you will get its only wicket");
                    System.out.println("Enter numbers between 1 to 6");
                    for (i = 0; i < 10; i++) {
                        p[i] = (int) (Math.random() * 6) + 1;
                        q[i] = sc.nextInt();
                        if (q[i] > 6) {
                            System.out.println("Sorry!Only numbers from 1 to 6 allowed!");
                            break;
                        }
                        System.out.println("The computer entered " + p[i] + " while you entered " + q[i]);
                        if (p[i] == q[i]) {
                            System.out.println("The computer is out!");
                            break;
                        }
                        s1 = s1 + p[i];
                        if (s1 > s) {
                            break;
                        }
                    }
                    System.out.println("The computer scored " + s1);
                    if (s == s1)
                        System.out.println("Its a draw");
                    if (s1 > s)
                        System.out.println("The computer wins");
                    if (s1 < s)
                        System.out.println("You win");
                }
            }
        }
    }

    public void oddeven(int a2) {
        int c1 = 0;
        int c2 = 0;
        System.out.println("To choose odd,press any odd number");
        System.out.println("To choose even,press any even number");
        e = sc.nextInt();
        if (e % 2 != 0) {
            System.out.println("You have chosen odd");
            System.out.println("Enter a number between 1 to 10");
            for (j = 0; j < a2; j++) {
                f = sc.nextInt();
                if (f > 10) {
                    System.out.println("Sorry!Only numbers between 1 to 10 allowed");
                    break;
                }
                g = (int) ((Math.random()) * 10) + 1;
                System.out.println("You chose " + f + " and the computer chose " + g);
                if ((f + g) % 2 == 0) {
                    c1 = c1 + 1;
                } else {
                    c2 = c2 + 1;
                }
            }
        }
        if (c1 > c) {
            System.out.println("You lose");
        }
        if (c1 < c) {
            System.out.println("You win");
        }
        if (c1 == c) {
            System.out.println("Its a draw");
        }
        if (e % 2 == 0) {
            System.out.println("You have chosen even");
            System.out.println("Enter a number between 1 to 10");
            for (j = 0; j < a2; j++) {
                f = sc.nextInt();
                if (f > 10) {
                    System.out.println("Sorry!Only numbers between 1 to 10 allowed");
                    break;
                }
                g = (int) ((Math.random()) * 10) + 1;
                System.out.println("You chose " + f + " and the computer chose " + g);
                if ((f + g) % 2 == 0) {
                    c1 = c1 + 1;
                } else {
                    c2 = c2 + 1;
                }
            }
            if (c1 > c) {
                System.out.println("You win");
            }
            if (c1 < c) {
                System.out.println("You lose");
            }
            if (c1 == c) {
                System.out.println("Its a draw");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        project2 ob = new project2();
        System.out.println("Welcome to ScopedSniper.com,India's premier gaming site");
        System.out.println("What game would you like to play?");
        System.out.println(
                "You could battle it out with the ferocious computer in rock,paper and scissors!To do so,press 1");
        System.out.println("You could bat it out in hand cricket!To do so,press 2");
        System.out.println("Or,if you are short on time,play odd or even,by pressing 3");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Rock paper and scissors is your choice");
                System.out.println("Enter the no. of games you want to play");
                int a1 = sc.nextInt();
                ob.rsp(a1);
                break;
            case 2:
                ob.cricket();
                break;
            case 3:
                System.out.println("You have chosen to play odd or even");
                System.out.println("Enter the number of games you want to play");
                int a2 = sc.nextInt();
                ob.oddeven(a2);
                break;
            default:
                System.out.println("Sorry!Wrong choice");
        }
    }
}