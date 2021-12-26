package anonymousClass;

public class ZooGiftShop2 {
  public int admission(int basePrice) {
    SaleTodayOnly sale = new SaleTodayOnly() {
      public int dollarsOff() {
        return 3;
      }
    };
    return basePrice - sale.dollarsOff();
  }

  interface SaleTodayOnly {
    int dollarsOff();
  }
}