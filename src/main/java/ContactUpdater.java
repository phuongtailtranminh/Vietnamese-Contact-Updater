import java.util.HashMap;
import java.util.Map;

public class ContactUpdater {

    private static Map<String, String> contactMap = new HashMap<String, String>();
    static {
        // Viettel
        contactMap.put("0162", "032");
        contactMap.put("0163", "033");
        contactMap.put("0164", "034");
        contactMap.put("0165", "035");
        contactMap.put("0166", "036");
        contactMap.put("0167", "037");
        contactMap.put("0168", "038");
        contactMap.put("0169", "039");
        contactMap.put("84162", "8432");
        contactMap.put("84163", "8433");
        contactMap.put("84164", "8434");
        contactMap.put("84165", "8435");
        contactMap.put("84166", "8436");
        contactMap.put("84167", "8437");
        contactMap.put("84168", "8438");
        contactMap.put("84169", "8439");
        // VinaPhone
        contactMap.put("0123", "083");
        contactMap.put("0124", "084");
        contactMap.put("0125", "085");
        contactMap.put("0127", "081");
        contactMap.put("0129", "082");
        contactMap.put("84123", "8483");
        contactMap.put("84124", "8484");
        contactMap.put("84125", "8485");
        contactMap.put("84127", "8481");
        contactMap.put("84129", "8482");
        // MobiPhone
        contactMap.put("0120", "070");
        contactMap.put("0121", "079");
        contactMap.put("0122", "077");
        contactMap.put("0126", "076");
        contactMap.put("0128", "078");
        contactMap.put("84120", "8470");
        contactMap.put("84121", "8479");
        contactMap.put("84122", "8477");
        contactMap.put("84126", "8476");
        contactMap.put("84128", "8478");
        // VietnamMobile
        contactMap.put("0186", "056");
        contactMap.put("0188", "058");
        contactMap.put("84186", "8456");
        contactMap.put("84188", "8458");
        // GMobile
        contactMap.put("0199", "059");
        contactMap.put("84199", "8459");
    }

    public static String fromOldNumber(String oldNumber) {
        if (oldNumber == null) {
            return "";
        }
        // +84
        if (oldNumber.substring(1, 3).startsWith("84")) {
            String firstFiveNumber = oldNumber.substring(1, 6);
            String newFirstFiveNumber = contactMap.get(firstFiveNumber);
            return oldNumber.replaceFirst(firstFiveNumber, newFirstFiveNumber);
        }
        // Normal case
        if (oldNumber.startsWith("0")) {
            String firstFourNumber = oldNumber.substring(0, 4);
            String newFirstFourNumber = contactMap.get(firstFourNumber);
            return oldNumber.replaceFirst(firstFourNumber, newFirstFourNumber);
        }
        return oldNumber;
    }

}
