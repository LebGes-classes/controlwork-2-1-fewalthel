package src.prod;
import java.util.ArrayList;
//4 вариант

public class Stack<Elem> {

    public Elem last; //последний доавленный элемент в стэк
    public ArrayList<Elem> array; // список наших элементов стэка

    public Stack() { //создание пустого стэка
        array = new ArrayList<>();
    }

    public boolean isEmpty() { //проверяет, пустли массив
        return this.last == null;
    }

    public void push(Elem elem) { //добавляет элемент в конец стэка
        if (this.isEmpty()) {
            this.last = elem;
            this.array.addFirst(elem);
        } else {
            int size = this.array.size();
            this.last = elem;
            this.array.add(size+1, elem);
        }
    }

    public Elem pop() { //возвращает последний элемент, в процессе удаляя его из стэка
        if (isEmpty()) {
            throw new RuntimeException("Массив пустой");
        }
        Elem result = this.last;
        this.array.remove(result);
        return result;
    }

    public Elem peek() { //возвращает последний элемент, в процессе НЕ удаляя его из стэка
        if (isEmpty()) {
            throw new RuntimeException("Массив пустой");
        }
        return this.last;
    }

    public void remove(Elem elem) { //удаляет последний элемент в стэке
        if (isEmpty()) {
            throw new RuntimeException("Массив пустой");
        }
        this.array.remove(elem);
    }

}
