package oo_design.call_center;

import java.util.List;

public class CallHandler {

  List<List<Employee>> listEmp;
  List<List<Call>> callQueues;

  public CallHandler() {}

  public void dispatchCall(Caller caller) {
    Call call = new Call(caller);
//    dispatchCall(call);
  }

//  public void dispatchCall(Call call) {
//    Employee emp = getHandlerEmployee(call);
//    if (emp != null) {
//      emp.receiveCall(call);
//      call.setHandler(emp);
//    } else {
//      // add call to the queue according to its rank
//      callQueues.get(call.getRank()).add(call);
//    }
//  }

  // check free employee with minimum rank
//  private Employee getHandlerEmployee(Call call) {}
}
