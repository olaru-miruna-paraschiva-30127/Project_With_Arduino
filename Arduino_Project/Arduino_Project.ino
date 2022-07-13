#include <Keypad.h>
int buzzerPin = 8;

int t = 0;
int k = 0;
int p = 0;
int c = 0;
int deschis = 0;
int pirPin = 0;
int pirStat = 0;
int pirStat1 = 0;
const int ROW_NUM = 4; //four rows
const int COLUMN_NUM = 4; //four columns

char keys[ROW_NUM][COLUMN_NUM] = {
  {'^', '*', 'C', 'D'},
  {'B', 'A', '9', '0'},
  {'8', '7', '5', '6'},
  {'4', '3', '1', '2'}
};

byte pin_rows[ROW_NUM] = {7, 6, 5, 4}; //connect to the row pinouts of the keypad
byte pin_column[COLUMN_NUM] = {10, 11, 12, 13}; //connect to the column pinouts of the keypad

Keypad keypad = Keypad( makeKeymap(keys), pin_rows, pin_column, ROW_NUM, COLUMN_NUM );
void setup() {
  pinMode (buzzerPin, OUTPUT);

  //Serial.begin(9600);

}
int h = 0;
void loop() {



  int a[] = {49, 50, 51, 52};
  int b[4];
  char key = keypad.getKey();

  if (key) {
    if (p == 4)p = 0;
    b[p] = int(key);

    h = 1;
    digitalWrite (buzzerPin, LOW);
    delay (250);
    if (b[p] == a[p]) {
      t++;
      Serial.print(t);
      Serial.print(p);
      if (t % 4 == 0) {
        if (deschis == 0)deschis = 1;
        else
          deschis = 0;
        digitalWrite (buzzerPin, LOW);
        delay (1500);
        k = 0;
        digitalWrite (buzzerPin, HIGH);

        delay (500);

        c++;
        //if(c%2==0)t=0;





      }
    }
    if (b[p] != a[p] || (b[p] == a[p] && t % 4 > 0)) {
      if (p == 3) {
        k++;
        t = 0;
        Serial.print(t);
        Serial.print(k);
        if (k < 3) {
          digitalWrite (buzzerPin, LOW);
          delay (150);
          digitalWrite (buzzerPin, HIGH);

          delay (150);
          digitalWrite (buzzerPin, LOW);
          delay (150);
          digitalWrite (buzzerPin, HIGH);

          delay (150);
          digitalWrite (buzzerPin, LOW);
          delay (150);
          digitalWrite (buzzerPin, HIGH);

          delay (150);
          digitalWrite (buzzerPin, LOW);
          delay (150);
          digitalWrite (buzzerPin, HIGH);

          delay (150);

        }
      }
      if (k == 3) {
        int l = 50;
        while (l > 0) {
          digitalWrite (buzzerPin, LOW);
          delay (100);
          digitalWrite (buzzerPin, HIGH);

          delay (100);
          l--;
        }
        k = 0;
      }
    }
    p++;
  }
  else {
    digitalWrite (buzzerPin, HIGH);
  }

  pinMode(pirPin, INPUT);
  pirStat = analogRead(pirPin);



  if (t % 4 == 0 && c > 0 && deschis == 1) {



    if (pirStat == 1023) {

      Serial.println(pirStat);
      Serial.println(deschis);
      digitalWrite (buzzerPin, HIGH);
      delay (100);
      digitalWrite (buzzerPin, HIGH);

      delay (200);
    }
    if (pirStat < 1023) {
      Serial.println(pirStat);
      Serial.println(deschis);
      digitalWrite (buzzerPin, HIGH);
      delay (200);
      digitalWrite (buzzerPin, LOW);

      delay (100);
    }

  }
}
