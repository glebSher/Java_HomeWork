import java.util.Arrays;
import java.util.List;

import java.util.*;
import java.lang.Math;

public class sem1_task1 {
  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    int len = getNumberByUser("Р’РІРµРґРёС‚Рµ РєРѕР»РёС‡РµСЃС‚РІРѕ СЌР»РµРјРµРЅС‚РѕРІ ");
    int[] items = createArray(len);
    fillArray(items, 0, 10);
    System.out.println(print2(items));

    int evenCount = getCountEvenItems(items);
    int[] evenItems = getEvenItems(items, evenCount);
    System.out.println(print2(evenItems));

  }

  // 2.1 РЎРѕР·РґР°РЅРёРµ РјР°СЃСЃРёРІР°
  static int[] createArray(int size) {
    return new int[size];
  }

  // 2.0 Р’РІРѕРґ С‡РёСЃР»Р°
  static int getNumberByUser(String text) {
    System.out.print(text);
    return input.nextInt();
  }

  // 2.2 Р—Р°РїРѕР»РЅРµРЅРёРµ РјР°СЃСЃРёРІР°
  static void fillArray(int[] col, int min, int max) {
    int count = col.length;

    int index = 0;
    while (index < count) {
      col[index] = random.nextInt(min, max);
      index = index + 1;
    }
  }

  // 2.4 РџРµС‡Р°С‚СЊ СЂРµР·СѓР»СЊС‚Р°С‚Р°
  static String print(int[] data) {
    String output = "";
    int count = data.length;

    int index = 0;
    while (index < count) {
      output += data[index] + " ";
      index = index + 1;
    }
    return output;
  }

  // 2.4 РџРµС‡Р°С‚СЊ СЂРµР·СѓР»СЊС‚Р°С‚Р°
  static String print2(int[] data) {
    String output = "";
    int count = data.length;

    int index = 0;
    while (index < count) {
      output += data[index] + "><";
      index = index + 1;
    }
    return output;
  }

  // 2.3 РџРѕР»СѓС‡РµРЅРёРµ С‚РѕР»СЊРєРѕ С‡РµС‚РЅС‹С… С‡РёСЃРµР»
  static int[] getEvenItems(int[] rawData, int countEvenElements) {
    int count = rawData.length;
    int[] evenItems = createArray(countEvenElements);

    int k = 0;

    for (int i = 0; i < count; i++) {
      if (rawData[i] % 2 == 0) {
        evenItems[k] = rawData[i];
        k++;
      }
    }
    return evenItems;
  }

  // 2.5 РџРѕР»СѓС‡РµРЅРёРµ РєРѕР»-РІР° С‡РµС‚РЅС‹С… С‡РёСЃРµР»
  static int getCountEvenItems(int[] array) {
    int length = array.length;
    int count = 0;
    for (int i = 0; i < length; i++) {
      if (array[i] % 2 == 0)
        count++;
    }
    return count;
  }

}

// РґР°РЅ РјР°СЃСЃРёРІ С‡РёСЃРµР», РЅСѓР¶РЅРѕ СЃС„РѕСЂРјРёСЂРѕРІР°С‚СЊ РЅРѕРІСѓСЋ РІС‹Р±РѕСЂРєСѓ РёР· С‚РѕР»СЊРєРѕ С‡РµС‚РЅС‹С… С‡РёСЃРµР»
// 1. РЈС‚РѕС‡РЅСЏС‚СЊ РўР—
// 2. Р”РµРєРѕРјРїРѕР·РёС†РёСЏ

// 2.0 Р’РІРѕРґ С‡РёСЃР»Р°
// 2.1 РЎРѕР·РґР°РЅРёРµ РјР°СЃСЃРёРІР°
// 2.2 Р—Р°РїРѕР»РЅРµРЅРёРµ РјР°СЃСЃРёРІР°
// 2.4 РџРµС‡Р°С‚СЊ СЂРµР·СѓР»СЊС‚Р°С‚Р°

// 2.3 РџРѕР»СѓС‡РµРЅРёРµ С‚РѕР»СЊРєРѕ С‡РµС‚РЅС‹С… С‡РёСЃРµР»
// 2.5 РџРѕР»СѓС‡РµРЅРёРµ РєРѕР»-РІР° С‡РµС‚РЅС‹С… С‡РёСЃРµР»

// 3. РђР»РіРѕСЂРёС‚Рј
// 4. РљРѕРґ
// 5. РўРµСЃС‚С‹
