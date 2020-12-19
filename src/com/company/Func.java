package com.company;
import jregex.Pattern;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Func {
    //1.1
    public static int remainder(int var_1, int var_2){
        int n;
        n = var_1 % var_2;
        return n;
    }
    //1.2
    public static int triArea(int var_1, int var_2){
        int n;
        n = (var_1 * var_2)/2;
        return n;
    }
    //1.3
    public static int animals(int var_1, int var_2, int var_3){
        int n;
        int chick = 2;
        int cows = 4;
        int pigs = 4;
        n = ((var_1 * chick)+(var_2 * cows)+(var_3 * pigs));
        return n;
    }
    //1.4
    public static double profitableGamble(double prob, double prize, double pay){

        if (prob * prize > pay){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        return(0);
    }
    //1.5
    public static int operation(int N, int a, int b){

        if (a + b == N){
            System.out.println("Added");
        }
        if (a * b == N){
            System.out.println("Miltiply");
        }
        if (a - b == N){
            System.out.println("subtracted");
        }
        if (a / b == N){
            System.out.println("Dev");
        }
        if (a + b != N & a * b !=N & a - b != N & a / b != N){
            System.out.println("None");
        }
        return(0);
    }
    //1.6
    public static double ctoa(char m){
        System.out.println((int)m);
        return(0);
    }
    //1.7
    public static int addUpTo(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++) {
            result = result * i;
        }
        return(result);
    }
    //1.8
    public static int nextEdge(int a,int b){
        int n;
        n = a+b-1;
        return(n);
    }
    //1.9
    public static int sumOfCubes(int x[]) {
        int sum=0;
        int v;
        for(int i=0; i<x.length; i++) {
            v = x[i] * x[i] * x[i];
            sum=sum+v;
        }
        return(sum);
    }
    //1.10
    public static int abcmath(int a,int b,int c){
        int r=0;
        int i=0;
        while(i < b){
            a = a + a;
            i++;
        }
        if(a/c==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        return(a);
    }
    //2
    public static String repeat(String x, int g){
        String[] h = x.split(""); //разбить строку на символы
        String c = "";//пустое слово
        for (String l : h) {
            for (int i = 0; i < g; i++) {// цикл запись количества нашего числа g (количество символов)
                c = c + l;// счетчик количство букв

            }
        }
        return(c);
    }
    //2.2
    public static int different(int x[]){
        int max =-100000;
        int j;
        int min = 100000;
        for(int i =0; i < x.length;i++){ // прогоняем массив , чтобы найти максимум
            if (x[i] > max) { // сравниваем с максимуму
                max = x[i]; // записываем в максимум
            }
        }
        for(int i =0; i < x.length;i++){// тот же цикл только с меньшим числом
            if (x[i] < min) {
                min = x[i];
            }
        }
        j = max - min;
        return(j);
    }
    //2.3
    public static boolean isAvgWhole(int x[]){
        int k=0;
        int j=0;
        boolean boo = false;
        for(int i =0; i < x.length;i++){ // прогоняемся по массиву
            j = j + x[i];// считаем сумму массива
            k++;// считаем количество символов
        }
        j = j / k;// считаем срднее число
        if(j/2==0){//равно ли целому
            boo = true;
        }
        return(boo);
    }
    //2.4
    static int[] addElement(int[] a, int e) {
        a  = Arrays.copyOf(a, a.length + 1);//передаем оригинальный массив и длину новогоо массива на плюс один элемент
        a[a.length - 1] = e;// новый массив в котором получаем новый элемент и перезаписываем массив
        return a;
    }

    public static int[] cumulativeSum(int[] a){
        int sum = 0;
        int[] qw = {};// массив пустой

        for (int i : a){// пока делится считаем нашу сумму
            sum += i;
            qw = addElement(qw,sum);
        }
        return qw;
    }
    //2.5
    public static int getDecimalPlaces(String a){
        int q;
        q = a.indexOf(".");// встреча индекса "."
        if (q == -1){ // если нету значения , то 0
            return 0;
        }
        q = (a.substring(q).length());// возвращение количества значений после "."
        return q-1;
    }
    //2.6
    public static int Fibonacci(int q){
        int a = 0;
        int b = 1;
        for (int i = 2; i <= q+1; ++i) {//счет в фибоначи не учитывает само знаечние и поэтому  i=2
            int next = a + b;//считаем сумму значений до нашего значения
            a = b;
            b = next;
        }
        return b;
    }
    //2.7
    public static boolean isValid(String q){
        boolean r = false;
        char[] result = q.toCharArray();// разбиваем нашу строку на символы
        if(result.length == 5){// если длина равна 5Б то
            for ( int i =0; i < result.length;i++){// проверяем на допустимость значений от 1 до 0
                if(result[i]>=0 || result[i] <=9){// если выполняется условие, то тру
                    r = true;
                }
            }
        }
        return r;
    }
    //2.8
    public static boolean isStrangePair(String q, String w){

        boolean r = false;

        char[] result = q.toCharArray();// разбиваем нашу строку на символы
        char[] result2 = w.toCharArray();// разбиваем нашу строку на символы

        int g = result2.length;// запись длины строки
        int f = result.length;// запись длины строки

        if ( g == 0 || f == 0){// если начальные символы строк
            if ( g == f ){// эти символы равны, то тру
                r = true;
            } return r;
        }

        if(result[0] == result2[g-1] & result[f-1] == result2[0]){//если начальный равен послденему второй сроки и наоборот, то тру
            r = true;
        }

        return r;
    }
    //2.9
    public static boolean isPrefix(String q, String w){
        boolean r = false;
        String we;
        we = w.substring(0,w.length()-2);// возвращается только часть от начала и двух символов
        if (q.startsWith(we)){//проверяет является ли строка префиксом с указаноого индекса
            r = true;
        }
        return r;
    }
    public static boolean isSuffix(String q, String w){// также тоолько для суффикса
        boolean r = false;
        String we;
        we = w.substring(1);//со второго символа
        if (q.endsWith(we)){//проверяет является ли строка префиксом с указаноого индекса
            r = true;
        }
        return r;
    }
    //2.10
    public static int boxSeq(int a){
        if (a%2==0){ //остаток от деления равен нулю
            return a;
        }else {// иначе прибавляем два
            return a+2;
        }
    }
    //3
    public static int solutions(int a, int b,int c){//счет корней в уравнении дискриминанта
        int n = 0;
        if(a == 0 & b == 0){
            n = 0;
            return n;
        }
        if ( b*b - 4*a*c == 0){//если равно 1
            n = 1;
        }
        if ( b*b - 4*a*c > 0){//если больше 2
            n = 2;
        }
        if ( b*b - 4*a*c < 0){//если меньше нету
            n = 0;
        }

        return n;
    }
    //3.2
    public static int findZip(String x){
        int f;
        int g;
        int j =0 ;
        String h;
        char[] result = x.toCharArray();//разбиваем нашу строку на символы
        f = x.indexOf("zip");//находим зип
        f = f + 3;//прибавляем три Z I P
        h = x.substring(f);// получения символов после zip первого
        g = h.indexOf("zip");// находим второй зип
        if (g == -1){// если нету
            return -1;// выводи -1 по условию
        }
        j=g+f;//если есть, то прибавляем количство символов
        return j;

    }
    //3.3
    public static boolean checkPerfect(int n){
        boolean boo = false;
        int o = 0;
        for (int i = 1; i < n; i++){
            if (n%i == 0){// если делится без остатка
                o= o + i;//записываем сумму
            }
        }
        if (o == n){boo = true;}//если сумма равна нашему числу, то тру
        return boo;

    }
    //3.4
    public static String flipEndChars(String s) {
        char[] result = s.toCharArray();//разбиваем строку на символы
        int f = s.length();
        String F = "";//инициализация пустой строки
        if (s.length() < 2) {//если длина меньше , то выводим несовместимо
            return "Incompatible.";
        }
        if (result[0] == result[f - 1]) {//если символы первый и последний совпадают, тоо пара
            return "Two's a pair.";
        }
        if (result[0] != result[f - 1]) {//если начальный символ не равен нулю, то
            F = s.charAt(s.length() - 1) + s.substring(1, s.length() - 1) + s.charAt(0);// получаем символы до конца + получаем от второогоо значения и конца + получаем символ сначала
        }
        return (F);
    }
    //3.5
    public static boolean isValidHexCode(String s){
        boolean boo = true;
        char[] result = s.toCharArray();// разбиваем нашу строку на символы

        if (s.charAt(0) != '#' || s.length() != 7) {// если начало без хеша или не равно 7, то фолс
            boo = false;
        }
        if (s.matches("(.)[^a-fA-F_0-9](.)")){//запись регулярноой строкой что если с начала строки без учета регистра и символы от 0 до 9
            boo = false;
        }
        return boo;
    }
    //3.6
    public static boolean arrUnic(int[] ar1, int[] ar2){
        boolean boo =false;
        String s1 = " ";//инициализируем пустую строку
        for (int n : ar1){// цикл коллекции
            if (!s1.contains((" "+String.valueOf(n)+" "))){//он берет n из  данного массиваи проверяет на совпадение конструкции в скобках
                s1 +=String.valueOf(n)+" ";// итератор счета строки уникальных символов
            }
        }
        String s2 = " ";//инициализируем пустую строку
        for (int n : ar2){// цикл коллекции
            if (!s2.contains((" "+String.valueOf(n)+" "))){//он берет n из  данного массиваи проверяет на совпадение конструкции в скобках
                s2 +=String.valueOf(n)+" ";// счетчик уникальных символов
            }
        }
        char[] ss1 = s1.toCharArray();// создаем массив симвлов (преобразуем в символы)
        char[] ss2 = s2.toCharArray();// создаем массив симвлов (преобразуем в символы)
        int q1 = 0;
        int q2 = 0;
        for (char q : ss1){ // цикл счета уникальных символов
            if (q == ' '){
                q1++;// счетчик
            }
        }
        for (char q : ss2){  // цикл счета уникальных символов
            if (q == ' '){
                q2++;//счетчик
            }
        }
        if (q1 == q2){boo = true;}
        return boo;
    }
    //3.7
    public static boolean isKaprekar(int n) {

        String nn = String.valueOf(n * n);
        if (nn.length() % 2 != 0) {//если число в квадрате нечетное, то
            nn = "0" + nn;// слева ноль, а справа наше число
        }
        if (Integer.parseInt(nn.substring(0, nn.length() / 2)) + Integer.parseInt(nn.substring(nn.length() / 2, nn.length())) == n) {
            return true;//(преобразует строку в число) если одну первую половину числа прибавть ко второй половине числа и если будет равно числу, то тру
        }
        return false;
    }
    //3.8
    public static String longestZero(String s){
        s = s + "1";
        char[] ss = s.toCharArray();//преобразуем строку в символы
        int count = 0;
        int countt = 0;
        boolean boo = false;
        for (char i : ss){//присваение значению i значение из  ss
            if (i == '0'){ boo = true; }// если i раен нулю, то тру
            else{boo = false;}// иначе фолс
            if(boo){
                count++;//итератор прибалвения счетчик(прибавление самого себя)
            }else{// иначе
                if (count>countt){countt=count; count = 0;}//если то
            }
        }
        String ans = "";
        for (int i = 0; i<countt; i++){
            ans+="0";
        }
        return ans;
    }
    //3.9
    public static int nextPrime(int n){
        int i,j;
        for (i=n;i<n + 1000000000;i++)//пока выполняется условие
        {int k=0;
            for (j=2;j<=i;j++)//вложенный цикл нахождения простогоо числа
            {
                if ((i%j) == 0)//если остатоок равен нулю, то прибавляем
                    k++;
            }
            if (k<2){ //если число было простым , то выводим его же
                return i;
            }
        }
        return 0;
    }
    //3.10
    public static boolean rightTriangle(int a,int b,int c) {
        boolean g = false;
        if (c * c == a * a + b * b || a * a == c * c + b * b || b * b == a * a + c * c) {//условия ребер для треугольника

            g = true;//совпадает , то тру
        }
        else{// иначе, нет
            g = false;
        }

        return g;
    }
    //4
    public static String text(String s) {//массив слов
        String[] ss = s.split(" ");// разделяем нашу строку на слова
        int k = Integer.parseInt(ss[0].substring(ss[0].indexOf(",") + 1));//преобразуем строку в число и выводим с начала до встречногоо индекса запятой и следующего значения после нее
        String сss = "";//инициализируем пустую строку
        int count = 0;
        int op = 1;
        for (String q : ss) {//по коллеции присваивание значения
            if (op-- > 0) continue;//уменьшает занчение
            if (count + q.length() <= k) {//сравнение длины слова и допустимости строки К<80
                сss += q + " ";//записваем в нашу строку
                count += q.length();
            } else {
                count = 0;
                сss += "\n";//перевод строки
                сss += q + " ";//увеличивается на это слово
                count += q.length();
            }
        }
        return сss;
    }
    //4.2
    public static StringBuilder split(String d){
        int k = 0 ;
        int g = 0;
        String a="";
        StringBuilder KitTiMamyMav = new StringBuilder();//екземплятор класса StringBuilder
        char[] result = d.toCharArray();// разбиваем на символы
        for (int i = 0;i < result.length;i++){// бежим по массиву result
            if(result[i] == '('){// если скобка , то увеличиваем к
                k++;//инкриментируем
                a+=result[i];//увеличиваем символ [i]
            }
            if(result[i] == ')'){//правая скобка
                g++;// уже другой счетчик
                a+=result[i];
                if(k == g){//если равен то балансируем строку
                    a = " " + a + " ";
                    KitTiMamyMav.append(a);//добавление в конец
                    k = 0;
                    g = 0;
                    a = "";
                }
            }
        }
        return KitTiMamyMav;
    }
    //4.3
    public static String toCamelCase(String d){
        // иницаилизация пустых строк
        String f = "";
        String g = "";
        String a = d; // приваивание исходной строки
        String v = "";
        int s;
        int k = 1;
        while (k == 1){

            s = a.indexOf("_"); ///ищем символ  _ в исходной строке
            f = a.substring(0,s-1); //подстрока от 0 до s
            g = a.substring(s+1); //подстрока от s+1 до конца
            v = a.substring(s+1,s+2);//подстрока от s+1 до s+2
            String Str = new String(v); // создание новой строки
            Str = Str.toUpperCase();// преобразование в верхний регистр
            g = a.substring(s+2);//подстрока от s+2 до конца
            g = Str + g; //присваем строке конкатенации строк Str и g
            a = ""; //объявление пустой строки
            a = a + f + g;
            s = 0;
            g = "";
            f = "";
            if (a.contains("_") == false){//если строка a не содержит символ _
                k = 0;
            }

        }
        return a;
    }

    public static String toSnakeCase(String d){
        String f = "";
        String g = "";
        String a = d;
        char[] result = a.toCharArray(); // объявление массива смиволов из исходной строки
        String v = "";
        int s;
        int k = 1;
        for (int i = 0;i < a.length();i++){ // цикл идёт от 0 до длины исходной строки
            v += result[i];  // к строке v добавляем i-ый символ
            if("ZXCVBNMASDFGHJKLQWERTYUIOP".contains(v)){ // если в это множество входит строка v
                f +="_" + v.toLowerCase(); // добавление символа _ и строки v в нижнем регистре
                v = "";
                continue; // пропуск итерации в цикле
            }
            v = "";
            f += result[i]; // добавление текущего символа к результату

        }

        return f;
    }
    //4.4
    public static String overTime(double[] arr){
        String p = "";
        double h = 0; //часы
        double ss = 0; // секунды
        double k = 0;
        double o = 0;
        double per = 0;
        double z = 0;
        ss = arr[0]; // начало рабочего дня
        k = arr[1]; // конец рабочего дня
        o = arr[2]; // почасовая ставка
        per = arr[3]; // множитель сверхурочных работ
        if (k == 17.0){ // если конец рабочего дня в 17.00
            h = (k - ss) * o; // считаем отработанные часы
            p += "$" + h; // увелечение заработанного на кол-во часов
        }
        if (k > 17.0){ // если конец рабочего дня позже 17.00
            h = (k-ss-1) * o * per; // сверхурочные
            z = (k-ss-1) * o;
            z = z+h;
            p += "$" + z; // увелечение заработанного на часы + сверхурочные
        }
        return p;
    }
    //4.6
    public static String BMT(String ves,String rost) {
        String p = "";
        double funt = 0;
        double kg = 0;
        double metr = 0;
        double dd = 0;
        double res = 0;
        String ow = "Overweight";
        String nw = "Normal weight";
        String uw = "Underweight";
        if (ves.contains("pounds") == true) { // если строка ves содержит строку "pounds"
            int t = ves.indexOf("pounds"); // пишем сюда индекс этой подстроки
            p = ves.substring(0, t); // подстрока  от 0 до t
            funt = Double.parseDouble(p); // преобразование p в вещественное число
            funt = funt / 2.205; // подсчёт фунтов
        }

        // по аналогии
        if (rost.contains("inches") == true) {
            int t = rost.indexOf("inches");
            p = rost.substring(0, t);
            dd = Double.parseDouble(p);
            dd = dd / 39.37;
        }

        // по аналогии
        if (ves.contains("kilos") == true) {
            int t = ves.indexOf("kilos");
            p = ves.substring(0, t);
            kg = Double.parseDouble(p);
        }

        // по аналогии
        if (rost.contains("meters") == true) {
            int t = rost.indexOf("meters");
            p = rost.substring(0, t);
            metr = Double.parseDouble(p);
        }
        if (ves.contains("pounds") == true & rost.contains("inches") == true) { // если строка ves содержит строку "pounds" и rost содержит строку "inches"
            res = funt / (dd * dd);
            p += funt / (dd * dd); // считаем по формуле результат
        }
        if (ves.contains("pounds") == true & rost.contains("meters") == true) {
            res = funt / (metr * metr);
            p += funt / (metr * metr);
        }
        if (ves.contains("kilos") == true & rost.contains("meters") == true) {
            res = kg / (metr * metr);
            p += kg / (metr * metr);
        }
        if (ves.contains("kilos") == true & rost.contains("inches") == true) {
            res = kg / (dd * dd);
            p += kg / (dd * dd);
        }
        if (res < 18.5) { // если результат оказался меньше 18.5
            p = String.format("%.1f", res); // форматируем результат с одним знаком после запятой
            p = p + " " + uw; // записываем конечный результат (слева число, справа вердикт)
        }
        if (res > 18.5 & res < 24.9) {
            p = String.format("%.1f", res);
            p = p + " " + nw;
        }
        if (res > 25) {
            p = String.format("%.1f", res);
            p = p + " " + ow;
        }
        return p;
    }
    //4.6
    public static int bugger(int s){
        int k = 0;
        int z = 1;
        int f = 1;
        int nat = 0;
        String n = String.valueOf(s); // преобразуем входное число в строку
        char[] ss = n.toCharArray(); // делаем массива символов из n
        while(z==1){ // пока z равен 1
            for (int i=0;i<ss.length;i++){ // цикл от 0 до длины нашего числа
                nat = Character.getNumericValue(ss[i]); // преобразование символа ss[i] в число
                f *= nat; // умножение f на nat
            }
            ss = Integer.toString(f).toCharArray(); // получаем массива символов после преобрзования числа f в строку
            f = 1;
            k++;
            if (ss.length == 1){// если строка ss содержит 1 символ
                z = 0;
            }

        }
        if (ss.length == 1 & k == 1){// если строка ss содержит 1 символ и k равен 1
            k =0;
        }
        return k;
    }
    //4.7
    public static String toStarShorthand(String s){
        String f = "";
        String h = "";
        int k = 1;
        s = s + " ";
        char[] result = s.toCharArray(); // преобразование входной строки в массив символов
        char g = result[0]; // присваивание первого символа
        for (int i = 1; i<result.length;i++){ // уикл от 1 до длины резульрующей строки
            if( g == result[i]){ // если g равно текущему символу
                k++; // увеличиваем k на 1
            }else { // иначе
                if (k == 1){ // если k равно 1
                    f += g;
                }else { // если k не равно 1
                    h = String.valueOf(k); // преобразование k в строку
                    f += g + "*" + h; // соединения символов * g и h
                    k = 1;
                }
                g = result[i]; // записываем сюда ткущий символ резульрующей строки
            }
        }
        return f;
    }
    //4.8
    public static boolean doesRhyme(String s, String q){
        boolean g = false;
        String f = "";
        String j = "";
        char v;
        String lastWord = s.substring(s.lastIndexOf(" ")+1); // подстрока от подследнего проблела строка s до конца
        String lastWord2 = q.substring(q.lastIndexOf(" ")+1);
        char[] result1 = lastWord.toCharArray(); // создание массива символов из lastWord
        char[] result2 = lastWord2.toCharArray();
        for (int i = 0;i < result1.length;i++){ // цикл от 0 до длины result
            v = result1[i]; // присваивние i-ого элемента из result1
            v = Character.toLowerCase(v); // делаем символ маленьким
            lastWord = "";
            lastWord += v; // увеличение на символ v
            if("aeyuio".contains(lastWord)){ // если "aeyuio" содержит lastWord
                f = f + lastWord; // увеличение f на lastWord
            }
        }
        for (int i = 0;i < result2.length;i++){ // цикл от 0 до длины result2
            //по аналогии с первым циклом
            v = result2[i];
            v = Character.toLowerCase(v);
            lastWord2 = "";
            lastWord2 += v;
            if("aeyuio".contains(lastWord2)){
                j = j + lastWord2;
            }
        }
        if (j.equals(f)){ // j равно f
            g = true;
        }
        return g;
    }
    //4.9
    public static boolean trouble(long n1, long n2){
        char[] s1 = (String.valueOf(n1)+" ").toCharArray(); // объявление массива символов из входного числа, преорбразованного в строку
        char[] s2 = (String.valueOf(n2)+" ").toCharArray();
        int c1 = 1;
        int c2 = 0;
        char w = s1[0] ; // присваивание первого символа из s1
        char per;
        for (int i = 1; i<s1.length; i++){ // цикл от 1 до длины s1
            if(w == s1[i]){
                c1++;
            }else{
                if (c1 == 3){
                    break; // выходим из цикла
                }
                w = s1[i];
            }
        }
        if (c1 != 3){
            return false;
        }
        for (int i = 1; i<s2.length; i++){
            if(w == s2[i]){
                c2++;
            }else{
                if (c2 == 2){
                    return true;
                }
            }
        }
        return false;
    }
    //4.10
    public static int countUniqueBooks(String s, char c){
        String cc ="";
        String q = "";
        cc+=c;
        char[] s1 = (s).toCharArray(); // объявление массива символов из s
        String vr = "";
        boolean open = false;
        String ww = "";
        for (char w : s1){ // цикла по коллекции в массиве s1
            ww +=w;
            if ((ww.equals(cc)) & open){ // если ww равно cc и open равен true
                open = false;
                if (vr.length()>0){ // если длина vr больше 0
                    // ass.append(vr);
                    q+=vr;
                }
                vr = "";
                ww = "";
                continue; // пропуск итерации
            }
            if ((ww.equals(cc))& !open){
                open = true;
                ww = "";
                continue;
            }
            if (open){ // если open - true
                vr += w; // увеличиваем vr на w
            }
            ww = "";
        }
        return q.replaceAll("(.)(?=.*?\\1)", "").length(); // заменяем все вхождения "(.)(?=.*?\\1)" на пустую строку
    }
    //5.1
    public static String encrypt(String s){
        char[] Charlotte = s.toCharArray(); // объявление массива символов
        String inputValue = "";
        int z = Integer.valueOf(Charlotte[0]); // конвертация первого символа в число
        inputValue += z;
        int n = 0;
        for (int i = 1;i < Charlotte.length;i++){ // цикл от 0 до количества символов
            n = Integer.valueOf(Charlotte[i]);
            z = n - z;
            inputValue += ","+ z;
            z = n;
        }
        return inputValue;
    }
    //5.2
    public static String decrypt(int[] charlotte){
        String inputValue="";
        inputValue = Character.toString(charlotte[0]); // конвертация первого числа в строку
        String n = "";
        int z = 0;
        z = charlotte[0]; // первое число
        for (int i = 1;i < charlotte.length;i++){ // цикл от 1 до количества чисел
            z = z + charlotte[i]; // инкременент на i-ое число
            n = Character.toString(z); // конвертация в строку
            inputValue = inputValue + n;
        }
        return inputValue;
    }
    //5.2
    public static Boolean canMove(String a, String b, String c){
        boolean Charlotte = false;
        a = a.toLowerCase(); // a в нижний регистр
        b = b.toLowerCase();
        c = c.toLowerCase();
        char[] n = b.toCharArray(); // b в массив символов
        char[] k = c.toCharArray();
        int zn = 0;
        int zk = 0;
        switch (a){// выбор из a
            case "pawn": // если pawn
                if(n[0] == k[0] & (k[1]-n[1]==2 || k[1]-n[1]==-2)){
                    Charlotte = true;
                }
                break;
            case "knight": // если knight
                zn = Integer.valueOf(n[0]); // n[0] в число
                zk = Integer.valueOf(k[0]);
                if(zk > zn & zk < zn+2 & (k[1]-n[1]==2 || k[1]-n[1]==-2) || zk < zn & zk > zn-2 &
                        (k[1]-n[1]==2 || k[1]-n[1]==-2)){
                    Charlotte = true;
                }
                if((zk - zn == 2 || zk - zn == -2) & (k[1]-n[1]==1 || k[1]-n[1]==-1)){
                    Charlotte = true;
                }
                break;
            case "queen": // если queen
                zn = Integer.valueOf(n[0]); // n[0] в число
                zk = Integer.valueOf(k[0]);
                if (k[1] == n[1] & zn != zk || k[1] != n[1] & zn == zk){
                    Charlotte = true;
                }
                if (n[1]-k[1] == zn - zk || k[1]-n[1]== zk-zn||n[1]-k[1] == zk - zn || k[1]-n[1]== zn-zk){
                    Charlotte = true;
                }
                break;
            case "bishop": // если bishop
                zn = Integer.valueOf(n[0]);
                zk = Integer.valueOf(k[0]);
                if (n[1]-k[1] == zn - zk || k[1]-n[1]== zk-zn || n[1]-k[1] == zk - zn || k[1]-n[1]== zn-zk){
                    Charlotte = true;
                }
                break;
            case "rook":
                zn = Integer.valueOf(n[0]);
                zk = Integer.valueOf(k[0]);
                if (k[1] == n[1] & zn != zk || k[1] != n[1] & zn == zk){
                    Charlotte = true;
                }
                break;
            case "king":
                zn = Integer.valueOf(n[0]);
                zk = Integer.valueOf(k[0]);
                if (k[1] == n[1] & (zk == zn -1 || zk == zn + 1)  || ( k[1] == n[1]-1 || k[1] == n[1] +1 ) & zn == zk){
                    Charlotte = true;
                }
                if (n[1]-k[1] == zn - zk & (n[1] - k[1] == 1 || k[1]-n[1]==1)
                        || k[1]-n[1] == zk-zn & (n[1] - k[1] == 1 || k[1]-n[1]==1)
                        || n[1]-k[1] == zk - zn & (n[1] - k[1] == 1 || k[1]-n[1]==1)
                        || k[1]-n[1]== zn-zk & (n[1] - k[1] == 1 || k[1]-n[1]==1) ){
                    Charlotte = true;
                }
                break;
        }
        return Charlotte;

    }
    //5.3
    public static boolean canComplete(String a,String b){
        boolean Charlotte = false;
        char[] n = a.toCharArray(); // a в массив символов
        char[] k = b.toCharArray();
        int q = 0;
        String f = "";
        for(int i = 0;i<n.length;i++){ // цикл от 0 до длины строк a
            for(int h = q ;h<k.length;h++){ // вложенный цикл от q до длины k
                if(n[i]==k[h]){ // если i-ый элемент равеный h-ому
                    f += k[h];
                    q = h;
                    break;
                }
            }
        }
        if (f.equals(a)){ // если f равно a
            Charlotte = true;
        }
        return Charlotte;
    }
    //5.4
    static public char[] sumDigProd(int ... s){
        int inputValue =0;
        for(int i = 0;i<s.length;i++){ // иикл от 0 до длины s
            inputValue = inputValue+ s[i];
        }
        int k = 0;
        int z = 1;
        int f = 1;
        int nat = 0;
        String n = String.valueOf(inputValue); // inputValue в n
        char[] ss = n.toCharArray(); // n в массив символов
        while(z==1){ // пока z остается равной 1
            for (int i=0;i<ss.length;i++){ // цикл от 0 до длины ss
                nat = Character.getNumericValue(ss[i]); // символ в число
                f *= nat;
            }
            ss = Integer.toString(f).toCharArray(); // f в строку и потом в массив символов
            f = 1;
            k++;
            if (ss.length == 1){ // если длина ss 1
                z = 0;
            }

        }
        if (ss.length == 1 & k == 1){ // если длина ss 1 и k равно 1
            k =0;
        }
        return ss;
    }
    //5.5
    public static String sameVowelGroup(String[] inputValue){
        char[] w; // массив символов
        String Charlotte = "";
        StringBuilder o = new StringBuilder(); // экземпляр StringBuilder
        String[] q = inputValue.clone(); // копия inputValue
        for (int i = 0; i<q.length; i++){ // цикл от 0 до длины q
            q[i] = q[i].replaceAll("(.)(?=.*?\1)", "");
            q[i] = q[i].replaceAll("[^aueouiAUEOIY]{1}",""); // выбор их тех слов, где гласные встречаются больше одного раза
            w = q[i].toCharArray(); // q[i] в массив символов
            Arrays.sort(w); // сортировка w
            Charlotte = new String(w);
            q[i] = Charlotte;
        }
        String d = q[0];
        Charlotte = "";
        for (int i = 0; i<q.length;i++){ // цикл от 0 до длины q
            if (d.equals(q[i])){ // если d равно q[i]
                Charlotte+=inputValue[i]+" ";
            }
        }
        return Charlotte;
    }
    //5.6
    public static boolean validateCard(long inputValue){
        String Charlotte = "";
        String r = "";
        Charlotte += inputValue;
        char[] w = Charlotte.toCharArray(); // массив символов
        char[] w1 = Arrays.copyOf(w,w.length-1); // копия w без последнего символа
        r+= w[ w.length-1]; // к увеличиваем на последний символ w
        int check =Integer.parseInt(r); // r в число
        int j = 0;
        for (int i = w.length-2;i>=0;i--){ // обратный цикл от длины w - 2 до 0
            w1[j++] = w[i];
        } //2
        int sum = 0;
        for (int i = 0; i<w1.length;i++){ // цикл от 0 до длиный w1
            // если остаток от деления i на 2 не 0, то сумма увеличится и итерация пропустится
            if (i%2 != 0){sum +=Integer.parseInt(String.valueOf(w1[i])); continue;}
            j = Integer.parseInt(String.valueOf(w1[i]))*2; // w[i] в число и умножить на 2
            j = j%10 + j/10%10; // остаток j на 10 + j делить на 10 и остаток от дел на 10
            w[i] = Character.forDigit(j,10); // представление j для радикса 10
            sum +=j;
        }
        sum = 10 - sum%10;
        if (sum == check){
            return true;
        }
        return false;
    }
    //5.7
    public static String correctTitle(String s){
        String[] f = {};
        String g="";
        String o = "";
        String v = "";
        char[] q ={};
        s = s.toLowerCase(); // s в нижний регистр
        for (int i=0;i<s.length();i++){ // цикл от 0 до длины s
            f = s.split(" ");
        }
        for(int h = 0;h<f.length;h++){ // цикл от 0 до длины f
            q = f[h].toCharArray();
            // f[h]  равно in и f[h], и равно the и f[h] равно on, и f[h] равно and
            if(!f[h].equals("in") && !f[h].equals("the") && !f[h].equals("on") && !f[h].equals("and")) {
                o += q[0];
                q[0] = Character.toUpperCase(q[0]);
            }
            g += String.valueOf(q) + " ";
        }
        return g;
    }
    //5.8
    public static String hexLattice(int n){
        double t = 0;
        int k = 0;
        while (n>t){ // пока n > е
            k++;
            t = 1 + 6*(0.5 * k*(k-1));

        }
        if (n != t){
            return "Invalid";
        }
        int how;
        int prob;
        String hex = "";
        for (int i = 0; i< 2*k-1; i++){ // цикл от 0 до 2
            if(i<k){ // если i < k
                how = k+i;
                prob = k-i;
            }else{
                how = k +2*k-2-i;
                prob= i-k+2;
            }
            for(int ll = 0; ll<prob;ll++){ // цикл от 0 до prod
                hex+=" ";
            }
            for(int ll = 0; ll<2*how-1;ll++){ // цикл от 0 до 2*how-1
                if (ll%2==0){ // если остаток от деления ll на 2 равен 0
                    hex+="o";
                }else{
                    hex+=" ";
                }
            }
            for(int ll = 0; ll<prob;ll++){ // цикл от 0 до prod
                hex+=" ";
            }
            hex+="\n";
        }
        return hex;
    }
    //5.9
    public static String numToEng(int inputValue){
        String g = "";
        int d = 0;
        int h = 0;
        char[] s = {}; // массив символов
        g +=inputValue;
        s = g.toCharArray();
        String[] dig = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        String[] dig1 = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] dig2 = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","hundred"};
        if (inputValue <=10){ // если inputValue меньше или равен 10
            g = dig[inputValue]; // берем dig по индексу inputValue
            return g;
        }
        if (inputValue == 10 || inputValue == 20 || inputValue == 30|| inputValue == 40|| inputValue == 50|| inputValue == 60|| inputValue == 70|| inputValue == 80
                || inputValue == 90){
            g = dig2[inputValue/10-1]; // берем dig2 по индексу inputValue/10-1
            return g;
        }
        if (inputValue >= 11 & inputValue < 20){
            g = dig1[inputValue%10-1];  // берем dig1 по индексу inputValue/10-1
            return g;
        }
        if (inputValue > 20 & inputValue < 100 & inputValue != 10 & inputValue != 20 & inputValue != 30 & inputValue != 40 & inputValue != 50
                & inputValue != 60 & inputValue != 70 & inputValue != 80 & inputValue != 90){
            g = dig2[inputValue/10%10-1] +" "+ dig[inputValue%10];
            return g;
        }
        if (inputValue == 100 || inputValue == 200 || inputValue == 300 || inputValue == 400 || inputValue == 500 || inputValue == 600
                || inputValue == 700 || inputValue == 800 || inputValue == 900){
            g = dig[inputValue/10/10] + " " + dig2[9];
            return g;
        }
        if (inputValue/10%10 == 0){
            g = dig[inputValue/10/10] + " " + dig2[9] + " " + dig[inputValue%10];
            return g;
        }

        if (s.length==3&inputValue%10==0){
            g = dig[inputValue/10/10] + " " + dig2[9] + " " + dig2[inputValue/10%10-1];
            return g;
        }

        if (s.length==3&inputValue%100>10& inputValue%100<20){
            g = dig[inputValue/10/10] + " " + dig2[9] + " " + dig1[inputValue%10-1];
            return g;
        }
        if (inputValue > 109 & inputValue < 1000 & inputValue != 100 & inputValue != 200 & inputValue != 300 & inputValue != 400 & inputValue != 500
                & inputValue != 600 & inputValue != 700 & inputValue != 800 & inputValue != 900){
            g = dig[inputValue/10/10] + " " + dig2[9] + " " + dig2[inputValue/10%10-1] + " " + dig[inputValue%10] ;
        }
        return g;
    }
    //5.10
    public static String numToRus(int inputValue){
        String g = "";
        int d = 0;
        int h = 0;
        char[] s = {};
        g +=inputValue;
        s = g.toCharArray();

        // инициализация русских слов

        String[] dig = {"ноль","один","два","три","четыре","пять","шесть","семь","восемь","девять","десять"};
        String[] dig1 = {"одиннадцать","двенадцать","тринадцать","четырнадцать","пятнадцать","шестнадцать","семнадцать",
                "восемнадцать","девятнадцать"};
        String[] dig2 = {"десять","двадцать","тридцать","сорок","пятьдесят","шестьдесят","семьдесят","восемьдесят",
                "девяносто","сто"};
        String[] dig3 = {"сто","двести","тристо","четыресто","пятьсот","шестьсот","семьсот","восемьсот","девятьсот"};
        if (inputValue <=10){
            g = dig[inputValue];
            return g;
        }

        // по аналогии с переводом на английский

        if (inputValue == 10 || inputValue == 20 || inputValue == 30|| inputValue == 40|| inputValue == 50|| inputValue == 60|| inputValue == 70|| inputValue == 80
                || inputValue == 90){
            g = dig2[inputValue/10-1];
            return g;
        }
        if (inputValue >= 11 & inputValue < 20){
            g = dig1[inputValue%10-1];
            return g;
        }
        if (inputValue > 20 & inputValue < 100 & inputValue != 10 & inputValue != 20 & inputValue != 30 & inputValue != 40 & inputValue != 50
                & inputValue != 60 & inputValue != 70 & inputValue != 80 & inputValue != 90){
            g = dig2[inputValue/10%10-1] +" "+ dig[inputValue%10];
            return g;
        }
        if (inputValue == 100 || inputValue == 200 || inputValue == 300 || inputValue == 400 || inputValue == 500 || inputValue == 600
                || inputValue == 700 || inputValue == 800 || inputValue == 900){
            g = dig[inputValue/10/10] + " " + dig2[9];
            return g;
        }
        if (inputValue/10%10 == 0){
            g = dig[inputValue/10/10] + " " + dig2[9] + " " + dig[inputValue%10];
            return g;
        }

        if (s.length==3&inputValue%10==0){
            g = dig3[inputValue/10/10-1] + " " + dig2[inputValue/10%10-1];
            return g;
        }

        if (s.length==3&inputValue%100>10& inputValue%100<20){
            g =  dig3[inputValue/10/10-1] + " " + dig1[inputValue%10-1];
            return g;
        }
        if (inputValue > 109 & inputValue < 1000 & inputValue != 100 & inputValue != 200 & inputValue != 300 & inputValue != 400 & inputValue != 500
                & inputValue != 600 & inputValue != 700 & inputValue != 800 & inputValue != 900){
            g = dig3[inputValue/10/10-1] + " " + dig2[inputValue/10%10-1] + " " + dig[inputValue%10] ;
        }
        return g;
    }

    //6

    public static int factF(int n, int k){
        return (fact(n))/(fact(k) * fact(n - k));
    }
    public static int fact(int n){
        int mult = 1;
        if (n == 0 || n == 1)
            return mult;
        else{
            for (int i = 1; i <= n; i++)
                mult *= i;
        }
        return mult;
    }
    //6.1
    public static void bell(int n){
        int sum = 1;
        for (int i = 2; i <= n; i++){
            sum += factF(n, i);
        }
        System.out.print("Число Белла: " + sum);
    }
    //6.2
    public static String translateWord(String a) {
        String ext = "";
        String firststring = "";
        String secondstring = "";
        char[] A = a.toCharArray(); // массив символов
        char[] glassnie = {
                'A',
                'E',
                'I',
                'O',
                'U',
                'Y',
                'a',
                'e',
                'i',
                'o',
                'u',
                'y'
        };
        int pos = -1;
        if (a.length() > 0) { // если длина a Ю 0
            if (pos == -1) { // до 1171 строки ищем первую гласную
                for (int i = 0; i < A.length; i++) { // цикл от 0 до длины A
                    for (int b = 0; b < glassnie.length; b++) { // цикл от 0 до длины glassnie
                        if (A[i] == glassnie[b]) {
                            pos = i;
                        }
                    }
                    if (pos != -1) {
                        break;
                    }
                }

            }
            firststring = a.substring(0, pos); // разбиение слова на 2 от начала до гласной и от гласной до конца
            secondstring = a.substring(pos, a.length());
            pos = -1;
            for (int b = 0; b < glassnie.length; b++) {
                if (A[0] != glassnie[b]) {//если первая буква согласная
                    ext = secondstring + firststring + "ay";
                    break;
                }
            }
            for (int n = 0; n < glassnie.length; n++) {
                if (A[0] == glassnie[n]) { // если первая глассная
                    ext = a + "yay";
                    break;
                }
            }
        } else {
            ext = " ";
        }
        return ext;
    }
    //6.3
    public static boolean validColor(String a) {
        // валидация rgb - свойства по паттерну regex
        return new Pattern("^rgb(a?)(?(?<=a)(\\(([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\s*,\\s*([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\s*,\\s*([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])(\\s*,\\s*[01]?((?<!1)(\\.\\d+)?)?)\\))|(\\(([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\s*,\\s*([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\s*,\\s*([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\)))$").matcher(a).find();
    }
    //6.4
    //Получение списка параметров
    public static String getParams(String s){
        return s.substring(s.indexOf('?') + 1);
    }
    //Удаление лишних параметров
    public static String deleting(String s, String[] letters){
        String[] params = getParams(s).split("&");//Получение массива выражений
        String[] chars = new String[params.length * 3];//Получение массива всех символов
        int count = 0; // Для заполнения чара
        // Заполнение чара
        for (int i = 0; i < params.length; i++){
            for (int j = 0; j < params[i].length(); j++){
                chars[count] = String.valueOf(params[i].charAt(j));
                count += 1;
            }
        }
        HashSet<String> bykva = new HashSet<>(); // Множество переменных
        //Заполнение множества переменных
        for (int i = 0; i < chars.length; i += 3){
            bykva.add(chars[i]);
        }
        //Проверка на нулевую длину массива удаляющихся аргументов
        if (letters.length != 0){
            for (int i = 0; i < letters.length; i++){
                bykva.remove(letters[i]);
            }
        }
        String[] bykvas = {};
        bykvas = bykva.toArray(new String[bykva.size()]);
        List<String> new_chars = new ArrayList<String>();
        //Генерация нового массива элементов
        for (int i = 0; i < bykvas.length; i++){
            for (int j = chars.length - 1; j >= 2; j -= 3){
                if (chars[j - 2].equals(bykvas[i])){
                    new_chars.add(chars[j - 2]);
                    new_chars.add("=");
                    new_chars.add(chars[j]);
                    if (i != bykvas.length - 1)
                        new_chars.add("&");
                    break;
                }
            }
        }
        String result = ""; //Финальная строка
        for (int i = 0; i < new_chars.size(); i++){
            result += new_chars.get(i);
        }
        return result;
    }
    //6.4
    //Проверка наличия параметров
    public static boolean has(String URL){
        if (URL.indexOf('?') != -1)
            return true;
        return false;
    }
    //6.4
    public static void stripUrlParams(String URL, String[] letters){
        if (has(URL)){ // если url есть
            System.out.println(URL.substring(0, URL.indexOf("?") + 1) + deleting(URL, letters)); // берем подстроку из url от 0 до вхождения знака вопроса и удаляем лишние параметры
        }
        else{
            System.out.println(URL);
        }
    }
    //6.5
    public static String getHashTags(String a){
        String ext = "";
        a = a.toLowerCase();
        String[] h = a.split(" ");
        String one = "";
        String two = "";
        String three = "";
        int k = -1;
        int j = -1;
        int l = -1;
        for(int i=0;i<h.length;i++){ //нахождение 1го подходящего слова
            if(one.length() < h[i].length()){
                one = h[i];
                k = i;
            }
        }
        for(int i=0;i<h.length;i++){ //нахождение 2го подходящего слова
            if(two.length() < h[i].length() && !h[i].equals(one)){
                two = h[i];
                j = i;
            }
        }
        for(int i=0;i<h.length;i++){ //нахождение 3го подходящего слова
            if(three.length() < h[i].length() && !h[i].equals(one) && !h[i].equals(two)){
                three = h[i];
                l = i;
            }
        }
        if(one.length()>0){ // если длина one больше 0
            one = "#" + one;
        }
        if(two.length()>0){
            two = "#" + two ;
        }
        if (three.length()>0){
            three = "#" + three;
        }
        if (three.length() == 0){
            ext = one + ", " + two;
        }else {
            ext = one + ", " + two + ", " + three; // склеивание результата
        }
        return ext;
    }
    //6.6
    public static void ulam(int x){
        List<Integer> Ulans_numbers = new ArrayList<Integer>(); // контейнер-лист чисел
        Ulans_numbers.add(1); // добавляем в контейнер 1
        Ulans_numbers.add(2);
        int len = 2;
        int nextNum = 3;
        int count = 0;
        while (len < x){ // пока длина меньше x
            for (int i = 0; i < len; i++){ // цикл от 0 до длины
                for (int j = i + 1; j < len; j++){ // цикл от i + 1 до длины
                    if ((Ulans_numbers.get(i) + Ulans_numbers.get(j)) == nextNum){ // если сумма i и j -ых эл-ов контейнера равна nextNum
                        count += 1;
                    }
                }
            }
            if (count == 1){
                Ulans_numbers.add(nextNum); // добавление в контейнер nexNum
                len += 1;
            }
            count = 0;
            nextNum += 1;
        }
        if (x == 1 || x == 2)
            System.out.println(x + " число в последовательнсоти Улама равно " + x);
        else
            System.out.println(x + " число в последовательнсоти Улама равно " + Ulans_numbers.get(len - 1));
    }
    //6.7
    public static String longestNonrepeatingSubstring(String str){
        String longestStr = "";
        String tempStr = "";
        for(int i = 0; i < str.length(); i++){ // цикл от 0 до длиный str
            if (tempStr.indexOf(str.charAt(i)) == -1){ // если temStr содержит i-ый символ строки str
                tempStr += str.charAt(i);
            }
            else{
                if (longestStr.length() < tempStr.length()){ // если длина longestStr меньше длины tempStr
                    longestStr = tempStr;
                    tempStr = "";
                }
            }
        }
        if (tempStr.length() > longestStr.length()){  // если длина longestStr больше длины tempStr
            longestStr = tempStr;
        }
        return longestStr;
    }
    public static boolean isOperation(char ch) {
        // выборка по знаку операции
        if (ch == '+') return true;
        if (ch == '-') return true;
        if (ch == '/') return true;
        if (ch == '*') return true;
        if (ch == '=') return true;
        return false;
    }
    //6.8
    public static String IntegerToRomanNumeral(int input) {
        if (input < 1 || input > 3999) // проверка диапозона
            return "Invalid Roman Number Value";
        String s = "";
        // цикл для конкретных римских значений
        while (input >= 1000) { // если входное число больше 1000
            s += "M"; // строку бафаем на M
            input -= 1000; // число декрементим на 1000
        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }
    //6.9
    public static boolean formula(String str){
        char[] str2 = str.toCharArray(); // массив символов из str
        if(str2.length==0)return false; // если длина str2 нулевая
        if(isOperation(str2[0]))return false; // если в начале символ операции, бросаем false
        int flag=0; // обнуляем флаг
        for(int i = 0;i < str2.length-1;i++){ // цилк от 0 до длины str2 -1
            if(str2[i]=='=')flag++; // если сейчас равно, то flag инкрементим
            if(isOperation(str2[i])&&isOperation(str2[i+1]))return false; // если подряд два символа операция, бросаем false
        }
        if(flag!=1)return false; // если flag не 1, бросаем false
        return true;
    }

    public static Boolean isPalindrome(String s) {
        char[] str2 = s.toCharArray();
        for(int i = 0;i< str2.length;i++){
            if(str2[i]!=str2[str2.length-1-i])return false; // если текущие полярные символы не равны, бросаем false
        }
        return true;
    }
    public static void palindrom(String str){
        char[] str2= str.toCharArray(); // массив смволов
        if(str2.length==1) System.out.println("false");
        boolean fl = isPalindrome(str); // проверка str на "палиндромность"
        if(fl){
            System.out.println("true");
        }
        else{
            int newStr = 0;
            int index=0;
            for(int i = 0;i < str2.length/2;i++){ // цикл от 0 до половины длины str2
                if(i!=0)
                    newStr*=10;
                char first = str2[index]; // символ str2 по индексу index
                char second = str2[1+index]; // символ str2 по индексу 1+index
                index+=2;
                newStr+=(((int)(first)-48)+((int)(second)-48));

            }
            System.out.println(newStr);
            String newString = Integer.toString(newStr);
            palindrom(newString);
        }
    }

}


