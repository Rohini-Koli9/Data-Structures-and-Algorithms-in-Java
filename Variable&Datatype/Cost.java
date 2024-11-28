import java.util.*;;
public class Cost {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float pencil = sc.nextInt();
            float pen = sc.nextInt();
            float eraser = sc.nextInt();
            float cost =(pencil+pen+eraser);
            System.out.println(cost);
            float costwithgst = cost + (0.18f * cost);
            System.out.println("Your Total cost with 18% gst included: "+costwithgst);
        }
    }
}
