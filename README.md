# Mail Sender

จัดทำโดย
นนทิพัทธ์ ศรีสุพรรณ 6410406690 หมู่ 1


กิตติกานต มากผล 6410451423 หมู่ 200


พิชญชนาธิป ดุลบุตร 6410450192 หมู่ 200


พีรสิษฐ์ พลอยอร่าม 6410451237 หมู่ 200


ศิวกร ภาสว่าง 6410451423 หมู่ 200


# About

Repository ส่วนนี้เป็นในส่วนการทำงานของ backend โดยจะรับ request จาก web api service แล้วส่ง request การส่ง mail ไปยัง mail server

# Build
```bash
mvn clean
mvn package -dskipTest
```


## Send OTP Mail - request with body

{

    "email": "xxx",

    "username": "xxx",

    "otp": "xxx"

}
