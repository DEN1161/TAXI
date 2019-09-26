public class Taxi {
  int landing = 60;
  int oneKm = 20;
  int maxOrder = 1000;
  int discount = 5;
  int maxDiscont = 100;

      int costOfTrip (int km){
      int orderAmount = landing + oneKm * km;
      if(orderAmount > maxOrder){
          double discontAmount = orderAmount / 100.0 * discount;
          if(discontAmount < maxDiscont){
              orderAmount -= discontAmount;
          }else {
              orderAmount -= maxOrder;
          }
      }
      return orderAmount;
  }

}