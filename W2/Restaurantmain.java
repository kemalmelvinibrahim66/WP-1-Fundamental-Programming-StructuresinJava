public class Restaurantmain {
    public static void main(String[] args) { 
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Pizza", 250000, 20); 
        Restaurant.nextId();

        menu.tambahMenuMakanan("Spaghetti", 80000, 20); 
        Restaurant.nextId();

        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30); 
        Restaurant.nextId();
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30); 
        menu.tampilMenuMakanan();

        menu.setstock(2, 50);

        menu.setstock(1, -12);

        menu.tampilMenuMakanan();

        menu.pesanMenu(1, 12);
        
        menu.tampilMenuMakanan();
    }
}
