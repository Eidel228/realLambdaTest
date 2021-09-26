package inhtest.app;

import inhtest.shapes.Shapable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class ConsolePrinter implements ActionListener {

    private int a = 0;
    private int b = 0;
    private final Shapable[] shapes;

    ConsolePrinter() {
        this.shapes = new ShapesRepository().getShapes();
        Shapable[] alphaShapes = shapes.clone();
        Arrays.sort(alphaShapes, Comparator.comparing(Shapable::toString));
        for (int i = 0; i < shapes.length;i++) System.out.println(shapes[i]+"   "+alphaShapes[i]);
    }

    private void printResult(int res){
        if(res==-1)System.out.println(shapes[a].toString()+" is less than "+shapes[b].toString());
        if(res== 0)System.out.println(shapes[a].toString()+" is equal to "+shapes[b].toString());
        if(res== 1) System.out.println(shapes[a].toString()+" is more than "+shapes[b].toString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (++b == shapes.length) b = ++a + 1;
        if (b == shapes.length) {
            a = 0;
            b = 1;
        }
        if (b > shapes.length) {
            if (shapes.length == 0) {
                System.out.println("There is no shapes");
                return;
            }
            System.out.println("There is only one shape");
            return;
        }
        printResult(shapes[a].compareTo(shapes[b]));
    }
}
