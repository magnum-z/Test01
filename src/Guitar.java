/**
 * Created by magnum on 16.11.2017.
 */
public class Guitar {
    int strings = 6;
    int pickups = 3;

    String[] typePickup = {"humbacker", "humbacker"};

    void VolumeUp() {

    }

    void VolumeDown() {

    }

    String typePickupToString() {
        String str = "[ ";

        for(int i = 0; i < pickups; i++) {

            try {
                str += typePickup[i];
            }
            catch (Throwable t) {
                str += "unknown";
            }

            if (i != pickups -1) {
                str += ", ";
            }
        }
        str += " ]";

        return str;
    }

    void PrintDetails() {
        System.out.println("Guitar contains:");
        System.out.println("   count of strings = " + strings);
        System.out.println("   count of pickups = " + pickups + " " + typePickupToString());
    }
}
