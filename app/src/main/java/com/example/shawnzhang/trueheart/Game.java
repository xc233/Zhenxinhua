package com.example.shawnzhang.trueheart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 这部分内容一定要在setContentView()之前调用
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // 去掉窗口标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_game);


        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int i = rand.nextInt(58);
                String[] arr = {
                        "如果看到自己最爱的人熟睡在你面前你会做什么？",
                        "写首自己最最喜爱的歌？",
                        "当你最不知道穿什么颜色的时候，你会选择什么颜色？",
                        "2010年你最后悔的一件事是什么？",
                        "曾经有过最被感动的事是什么？",
                        "比较喜欢爸爸还是妈妈？",
                        "你最想要的5样东西",
                        "最后一次发自内心的笑是什么时候？",
                        "如果给你一个机会去世界上任何一个地方旅行你会去：",
                        "如果时间能倒流你希望回到哪一时间？",
                        "在你心中谁最可信? ",
                        "和男女朋友进行到哪一步? ",
                        "身上哪个部位最敏感? 　",
                        "你对左边第三个异性有什么感觉?要具体。 　",
                        "你和在场的谁吵架会最伤心? ",
                        "在你洗澡时，有一个非常丑的异性冲了进来，你会怎么样(实话实说，希望不要采用极端手法) ",
                        "你最愿意和在场哪个异性私奔? ",
                        "你希望左边第3位异性是你的谁? 　",
                        "情人节最想收到什么礼物? ",
                        "你有没有钟意的人?是谁? ",
                        "你觉得在座那位异性的嘴唇看起来最想Kiss? 　",
                        "你是否幻想过或希望和你喜欢的人做那些事?只用回答有或没有(如实回答) ",
                        "你觉得你曾经喜欢的人和在座哪个人最像? 　",
                        "你希望右边第5个异性是你的谁 ",
                        "你想和在场的哪一位玩大冒险? 　",
                        "如果有来生你选择当? ",
                        "在场哪一位异性对你说我喜欢你，你会最开心? 　",
                        "我在你眼里什么样?(可以是上一位玩家，由主持人决定) 　",
                        "你最关心的异性是谁?(除了亲人或男女朋友) ",
                        "如果时间能倒流你希望回到哪一时间，为什么? ",
                        "如果前一个异性玩家爱上你了，你怎么办? 　",
                        "世界末日，你会幸存，并且你可以救一个人，你会救?男女都可以 　",
                        "你觉得在座最帅或最漂亮的人是谁? ",
                        "当玩大冒险的时候你被前一个异性玩家点名，你是什么心情? 　",
                        "跟异性做过最亲密的事是什么? ",
                        "洗澡洗到一半没水了怎么办?(注意是身上有泡沫的时候) ",
                        "你认为在座的哪一位异性可以成为你的性幻想对象? ",
                        "认同没有性的爱情和没有爱的性吗? 　",
                        "你觉得对面那个人那个部位最好看?(男女不限，如果没对其的话，就说两个人)",
                        "你的初吻是几岁，和谁？",
                        "你的初恋是几岁?",
                        "你的初恋对象是谁?",
                        "大学到现在共挂过几门课？",
                        "你亲吻过多少人？",
                        "在现场所有人中，你看哪位异性同学最舒服？",
                        "如果再给你一个机会，回到高中时代，最想对哪位异性说哪些话？",
                        "你第一个喜欢的异性叫什么名字？",
                        "你曾经意淫过在场的哪一位？",
                        "如果过去没有的话，你现在会选哪一位作为YY对象？",
                        "你对自己的梦中情的要求是什么？",
                        "让你一直念念不忘的一位异性的名字？原因？",
                        "谈过几次恋爱？",
                        "每天睡觉前都会想起的人是谁？",
                        "你最怕的事情或东西是什么（说出三件）。",
                        "你会不会在意ta的过去，为什么？",
                        "打算什么时候结婚？",
                        "现在心里想念的异性叫什么名字？",
                        "第一次爱的人对你产生过什么影响？",
                        "你在意你的老婆（老公）不是处女（处男）吗？"
                };//定义一个数组，模拟获取到的数组
                TextView textView;
                //使用findViewById 得到TextView对象
                textView = (TextView) findViewById(R.id.textView);
                //使用setText()方法修改文本
                textView.setText(arr[i]);
            }
        });

        Button button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int i = rand.nextInt(90);

                String[] arr2 = {
                        "背一位异性绕场一周",
                        "唱青藏高原最后一句","3.做一个大家都满意的鬼脸",
                        "抱一位异性直到下一轮真心话大冒险结束",
                        "向一位异性表白3分钟",
                        "与一位异性十指相扣，对视10秒 ",
                        "邀请一位异性为你唱情歌，或邀请一位异性与你情歌对唱",
                        "做自己最性感、最妩媚的表情或动作",
                        "吃下每个人为你夹得菜(如果是辣椒……) ",
                        "蹲在凳子上作便秘状 ",
                        "亲***(这个人可以事先指定)，或者亲一位异性，部位不限 ",
                        "深情的吻墙10秒 ",
                        "模仿古代特殊职业女子拉客 ",
                        "模仿脑白金广告，边唱边跳 ",
                        "让他到街上大喊“卖拖鞋啦～2块一双，买一送3” ",
                        "抓着铁门喊“放我出去!” 　",
                        "对陌生人美眉挤眉弄眼 ",
                        "躺在床上摆pose说饭在锅里，我在床上。",
                        "一人先用嘴吸住一纸牌，另一人用嘴从另一面将纸牌吸住移走;",
                        "女生仰躺地上，男生撑在上面，做五下俯卧撑;",
                        "男生仰躺地上，女生撑在上面，坚持5秒钟;",
                        "男生坐床上，女生躺床上，将头枕男生腿上，对视10秒; 　",
                        "男生将女生逼角落，用“调情式”一手撑墙，两人深情对视10秒; ",
                        "男生单腿下跪，女生伸手，男生亲女生手背; 　",
                        "男生单腿下跪，女生亲男生额头; 　",
                        "男生抱起女生，保持5秒钟; 　",
                        "男生把女生面对面抱起来，女生用双腿夹住男生; 　",
                        "对喝交杯酒; 　",
                        "对喂花生米; 　",
                        "跳舞转圈; 　",
                        "女生踩男生脚上跳舞; 　",
                        "女生坐男生小腿上，男生做仰卧起坐; ",
                        "拥抱; 　　",
                        "亲脸; 　",
                        "对亲脖子; 　",
                        "十指交扣握住保持一轮; 　",
                        "正面对着十指交扣，深情对视，深情朗诵骆宾王的《鹅》 ",
                        "情景剧：一男一女相遇，男生说：“你好，我姓锄名禾，你呢?”女生说：“我名叫当午。”男生女生同时说：“哦!原来是锄禾日当午啊!” ",
                        "站起來,大喊“我是超人,我要回家了!”; ",
                        "头顶簸箕，手拿笤帚，边跳边唱道：我爱劳动，我爱卫生; ",
                        "两人面对面作搓澡状，屁股还要一扭一扭的，还要唱'洗刷刷，洗刷刷'; 　",
                        "学水兵月做动作，然后对一个人說：我要代替月亮懲罰你!! ",
                        "找一男生把腿架他肩膀上让他捶腿; ",
                        "亲左数第二个异性的额头; 　",
                        "和左边第一个异性换穿上衣; ",
                        "说出京杭大运河的经过的中国五大水系; ",
                        "左手拉右耳，右手拉左耳，从桌子底下过; 　",
                        "和右边第二个异性，一个演水兵月，一个演超兽，然后水兵月要把超兽打倒; 　",
                        "穿自己的外套表演张倾城之“我脱、我穿、我再脱、我再穿”; 　",
                        "露出肚皮，扭腰扭屁股，各扭3圈; 　",
                        "和右边第一个异性关在厕所里等一轮游戏; 　",
                        "用手纸当围巾，围脖子上持续一轮游戏; 　",
                        "为右边第一个男生脱衣服，由下一轮抽中的人再为他船上; 　",
                        "把右边第一个异性横抱起来; ",
                        "慢慢地性感地把上衣撩起到不能再撩起的位置; 　",
                        "对窗外大喊“我好寂寞啊”; ",
                        "侧抱互相喂酒、喂吃的; 　",
                        "正面相隔做接吻陶醉状10秒; 　",
                        "原地转10圈(就近靠下); 　",
                        "跳肚皮舞; ",
                        "对外大喊我是猪;",
                        "走猫步; ",
                        "和左数第一个异性亲一下; 　",
                        "脱一件衣服持续到结束; 　",
                        "背起右边第一个女生; 　",
                        "做好莱坞kiss;",
                        "男的用胳膊从正面量女的胸围or女的量男的腰围(臀围...); ",
                        "大喊燃烧吧，小宇宙～ ",
                        "选一个男生，一边捶他的胸一边说：你好讨厌哦 　",
                        "选一个女生说：我将把你紧紧地搂在怀中，吻你亿万次，像在赤道上面那样炽烈的吻。(拿破仑致约瑟芬) ",
                        "跪地求婚状：如果我不向你求婚，我会后悔一辈子，因为你是我的惟一。(理察·基尔致朱丽叶·罗伯茨(在电影《逃跑的新娘》中)) 　",
                        "对着离你最近的异性的耳根敏感部位哈气，持续5秒 　" ,
                        "对亲脖子 　" ,
                        "与异性贴身热舞 " ,
                        "直接互亲嘴角(注意是互亲) 　" ,
                        "隔纸巾接吻(第一次可折叠，第二次不可，第三次分开!!) " ,
                        "主持人帮选一个异性，抽到的人亲或被亲两边脸颊、下巴、锁骨 　" ,
                        "拿一根饼干条，选一位异性各叼住两端，两人同时开始咬，两人的嘴移开饼干条的时候不能看到暴露在外的饼干条超过1厘米，如果中途饼干条断了，则需重来 　　" ,
                        "两只手贴着异性的脸，双眼对视一轮 　　" ,
                        "主持人选一位异性，找一个其他人把饼干棒掰小，多小由掰的人决定，抽中者必须把饼干棒从对方口中吃进自己嘴中。只能使用嘴 " ,
                        "选两位异性用嘴唇传纸牌 　" ,
                        "男生从女生腰背后双手摸过搂住女生的腰，下巴放在女生肩上，坚持5秒 　" ,
                        "选一位异性，互摸嘴唇 　" ,
                        "坐在异性大腿上坚持10秒 　" ,
                        "找一位你觉得在场最帅或最漂亮的一位异性合照 　" ,
                        "男生弹女生内衣大带 两边各一下 　" ,
                        "与一位身高差不多的异性紧紧的抱5秒，脸必须搭在对方身上 " ,
                        "选一位异性，由对方决定亲那里，不能是手 " ,
                        "拜托一个男生和一个女生紧紧的抱在一起坚持五秒钟。(要是失败了的话，就自己上) 　" ,
                        "男的靠在女的肚子上：老婆 几个月了 (男生选女生)要温柔的说 " ,
                        "男生松掉女生bra带 　" ,
                        "互亲鼻子"
                };//定义一个数组，模拟获取到的数组
                TextView textView;
                //使用findViewById 得到TextView对象
                textView = (TextView) findViewById(R.id.textView);
                //使用setText()方法修改文本
                textView.setText(arr2[i]);
            }
        });

    }
}