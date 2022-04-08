

#include <AFMotor.h>   //ucitavanje biblioteka za motor

AF_DCMotor motor1(1); //Prednji lijevi kotac / KOTAC 1
AF_DCMotor motor2(2); //Prednji desni kotac / KOTAC 2
AF_DCMotor motor3(3); //Zadnji desni kotac / KOTAC 3
AF_DCMotor motor4(4); //Zadnji lijevi kotac / KOTAC 4

String readString;

void setup()
{
  
  Serial.begin(9600);
  
  //postavljanje brzine motora
  motor1.setSpeed(100);   //100 sporije / 250 brze
  motor2.setSpeed(100);
  motor3.setSpeed(100);
  motor4.setSpeed(100);
}

void loop()
{
  while(Serial.available())
  {
    delay(50);
    char c=Serial.read();
    readString+=c;
  }
     if(readString.length()>0)
  {
    Serial.println(readString);
    
    if (readString =="FORWARD")     // IDI NAPRIJE
      {      
          motor1.run (FORWARD);
          motor2.run (FORWARD);
          motor3.run (FORWARD);
          motor4.run (FORWARD);
       }
    
    if (readString =="BACKWARD")    // IDI NAZAD
      {     
          motor1.run (BACKWARD);
          motor2.run (BACKWARD);
          motor3.run (BACKWARD);
          motor4.run (BACKWARD);
      }
    
    if (readString =="LEFT")      // POMAKNI SE NA LIJEVO
      {     
          motor1.run (BACKWARD);
          motor2.run (FORWARD);
          motor3.run (BACKWARD);
          motor4.run (FORWARD);
      }
    
    if (readString =="RIGHT")     // POMAKNI SE NA DESNO
      {     
          motor1.run (FORWARD);
          motor2.run (BACKWARD);
          motor3.run (FORWARD);
          motor4.run (BACKWARD);
      }
    
    if (readString =="FORWARDLEFT")     // POMAKNI SE NAPRIJED LIJEVO
      {     
          motor1.run (RELEASE);
          motor2.run (FORWARD);
          motor3.run (RELEASE);
          motor4.run (FORWARD);
      }
    
    if (readString =="FORWARDRIGHT")    // POMAKNI SE NAPRIJED DESNO
      {     
          motor1.run (FORWARD);
          motor2.run (RELEASE);
          motor3.run (FORWARD);
          motor4.run (RELEASE);
      }
    
    if (readString =="BACKWARDLEFT")    // POMAKNI SE NAZAD LIJEVO
      {     
          motor1.run (BACKWARD);
          motor2.run (RELEASE);
          motor3.run (BACKWARD);
          motor4.run (RELEASE);
       }
    
    if (readString =="BACKWARDRIGHT")    // POMAKNI SE NAZAD DESNO
       {     
          motor1.run (RELEASE);
          motor2.run (BACKWARD);
          motor3.run (RELEASE);
          motor4.run (BACKWARD);
       }
      
    if (readString =="ROTATELEFT")      // ROTIRAJ SE NA LIJEVO
       {     
          motor1.run (BACKWARD);
          motor2.run (BACKWARD);
          motor3.run (FORWARD);
          motor4.run (FORWARD);
       }
    
    if (readString =="ROTATERIGHT")     // ROTIRAJ SE NA DESNO
       {     
          motor1.run (FORWARD);
          motor2.run (FORWARD);   
          motor3.run (BACKWARD);  
          motor4.run (BACKWARD);  
        }
        
    if (readString =="ONEROTATELEFT")     // ROTIRAJ SE OKO KOTACA BROJ 1 NA LIJEVO
      {     
          motor1.run (RELEASE);
          motor2.run (FORWARD);   
          motor3.run (FORWARD);  
          motor4.run (RELEASE); 
      }
     
    if (readString =="ONEROTATERIGHT")      // ROTIRAJ SE OKO KOTACA BROJ 1 NA DESNO
      {     
          motor1.run (RELEASE);
          motor2.run (BACKWARD);   
          motor3.run (BACKWARD);  
          motor4.run (RELEASE); 
       }
     
    if (readString =="THREEROTATELEFT")     // ROTIRAJ SE OKO KOTACA BROJ 3 NA LIJEVO
       {     
          motor1.run (BACKWARD);
          motor2.run (RELEASE);   
          motor3.run (RELEASE);  
          motor4.run (BACKWARD); 
       }
       
    if (readString =="THREEROTATERIGHT")      // ROTIRAJ SE OKO KOTACA BROJ 3 NA DESNO
       {     
          motor1.run (FORWARD);
          motor2.run (RELEASE);   
          motor3.run (RELEASE);  
          motor4.run (FORWARD); 
       }
      
    
    if (readString =="STOP")                  // ZAUSTAVI SE
       {     
          motor1.run (RELEASE);
          motor2.run (RELEASE);
          motor3.run (RELEASE);
          motor4.run (RELEASE);
       }

    readString="";
  }
}
