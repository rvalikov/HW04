package HW04;
import java.util.ArrayList;
import java.util.Scanner;
public class task01 {



        public static void main(String[] args) {
            ArrayList<String> memory = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Введите строку или команду (print/revert): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("print")) {
                    System.out.println("Введенные строки:");
                    for (int i = memory.size() - 1; i >= 0; i--) {
                        System.out.println(memory.get(i));
                    }
                } else if (input.equalsIgnoreCase("revert")) {
                    if (!memory.isEmpty()) {
                        memory.remove(memory.size() - 1);
                        System.out.println("Последняя строка удалена из памяти");
                    } else {
                        System.out.println("Память пуста");
                    }
                } else {
                    memory.add(input);
                    System.out.println("Строка добавлена в память");
                }
            }
        }
    }

