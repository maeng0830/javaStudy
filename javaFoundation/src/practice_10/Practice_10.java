package practice_10;// Practice
// 아래 Device 추상 클래스를 이용하여
// UsbPort1 클래스와 WiFi 클래스를 자유롭게 구현해보세요.

abstract class Device {
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

// UsbPort1 클래스
class UsbPort1 extends Device {
    UsbPort1(int id) {
        this.deviceId = id; // deviceId는 자식 클래스에서 선언되지 않았으므로 추상 클래스의 필드를 가리킴.
    }

    void deviceInfo() {
        System.out.println("id = " + this.deviceId);
    }

    void connect() {
        System.out.println("연결했습니다.");
    }

    void disconnect() {
        System.out.println("연결이 해제되었습니다.");
    }

    void send() {
        System.out.println("데이터를 전송합니다.");
    }

    void receive() {
        System.out.println("데이터를 수신합니다.");
    }
}


// WiFi 클래스
class WiFi extends Device {
    public WiFi(int id) {
        this.deviceId = id;
    }

    @Override
    void deviceInfo() {
        System.out.println("id = " + this.deviceId);
    }

    @Override
    void connect() {
        System.out.println("연결했습니다.");
    }

    @Override
    void disconnect() {
        System.out.println("연결이 해제되었습니다.");
    }

    @Override
    void send() {
        System.out.println("데이터를 전송합니다.");
    }

    @Override
    void receive() {
        System.out.println("데이터를 수신합니다.");
    }
}


public class Practice_10 {

    public static void main(String[] args) {
        // Test code
        UsbPort1 usb1 = new UsbPort1(1);
        WiFi wifi = new WiFi(2);

        usb1.deviceInfo();
        wifi.deviceInfo();
    }

}
