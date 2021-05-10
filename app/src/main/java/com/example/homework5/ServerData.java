package com.example.homework5;

import java.util.ArrayList;
import java.util.List;

public class ServerData {
    public static List<ProgrammLanguage> list = new ArrayList<>();

    public static List<ProgrammLanguage> getLanguage(){
        list.add(new ProgrammLanguage("Java", R.drawable.java,"Java — строго типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems. Разработка ведётся сообществом, организованным через Java Community Process; язык и основные реализующие его технологии распространяются по лицензии GPL. "));
        list.add(new ProgrammLanguage("Kotlin", R.drawable.kotlin, "Kotlin — статически типизированный, объектно-ориентированный язык программирования, работающий поверх Java Virtual Machine и разрабатываемый компанией JetBrains. Также компилируется в JavaScript и в исполняемый код ряда платформ через инфраструктуру LLVM."));
        list.add(new ProgrammLanguage("Phython", R.drawable.phython, "Python — высокоуровневый язык программирования общего назначения с динамической строгой типизацией и автоматическим управлением памятью, ориентированный на повышение производительности разработчика, читаемости кода и его качества, а также на обеспечение переносимости написанных на нём программ."));
        list.add(new ProgrammLanguage("PHP", R.drawable.php, "PHP — скриптовый язык общего назначения, интенсивно применяемый для разработки веб-приложений. В настоящее время поддерживается подавляющим большинством хостинг-провайдеров и является одним из лидеров среди языков, применяющихся для создания динамических веб-сайтов. "));
        return list;
    }
}
