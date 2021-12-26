package anonymousClass;

public class ZooGiftShop {
  public int admission(int basePrice) {
    SaleTodayOnly sale = new SaleTodayOnly() {
      int dollarsOff() {
        return 3;
      }
    }; // Don't forget the semicolon!
    return basePrice - sale.dollarsOff();
  }

  abstract class SaleTodayOnly {
    abstract int dollarsOff();
  }
}