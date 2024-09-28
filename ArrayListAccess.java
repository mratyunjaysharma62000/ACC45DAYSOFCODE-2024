import java.util.ArrayList;

public class ArrayListAccess {
    public static void main(String[] args) {
        ArrayList<String> topCompanies = new ArrayList<>();
        System.out.println("Is the top companies list empty? : " + topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");
        System.out.println("Here are the top " + topCompanies.size() + " Companies in the world");
        System.out.println(topCompanies);
        String bestCompany = topCompanies.get(0);
        System.out.println("Best Company : " + bestCompany);
        String secondBestCompany = topCompanies.get(1);
        System.out.println("Second Best Company : " + secondBestCompany);
        String lastCompany = topCompanies.get(topCompanies.size()-1);
        System.out.println("Last Company : " + lastCompany);

        topCompanies.set(4,"Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
    }
}
