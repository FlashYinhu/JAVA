package StringDemo;

public class SensitiveWordReplace {
    public static void main(String[] args) {
        String talkStr = "你他娘的还真是个天才!";
        String talkStrReplaced = talkStr.replace("他娘的", "***");
        System.out.println(talkStrReplaced);

        // 定义一个敏感词库
        String[] uglyWords = {"他妈的", "你他娘的", "操"};
        String str1 = "他妈的你他娘的我操";
        for(int i = 0; i < uglyWords.length; i ++) {
            str1 = str1.replace(uglyWords[i], "**");
        }
        System.out.println(str1);

    }
}
