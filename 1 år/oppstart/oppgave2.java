����   < H  java1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Ljava1; main ([Ljava/lang/String;)V  type in hours:
    javax/swing/JOptionPane   showInputDialog &(Ljava/lang/Object;)Ljava/lang/String;  type in Minutes:  type in seconds:
    java/lang/Float   ! 
parseFloat (Ljava/lang/String;)F # java/lang/StringBuilder % Det tilsvarer 
 " '  ( (Ljava/lang/String;)VEa  Bp  
 " , - . append (F)Ljava/lang/StringBuilder; 0 s
 " 2 - 3 -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 " 5 6 7 toString ()Ljava/lang/String;
  9 : ; showMessageDialog )(Ljava/awt/Component;Ljava/lang/Object;)V args [Ljava/lang/String; hours Ljava/lang/String; minutes secondss hour F minute seconds 
SourceFile 
java1.java                  /     *� �    
                    	       �     K� L� M� N+� 8,� 8-� 8� "Y$� &)j*jbb� +/� 1� 4� 8�    
   "          	  
   $  J     H    K < =    E > ?   ? @ ?   9 A ?   3 B C   - D C  $ ' E C   F    G