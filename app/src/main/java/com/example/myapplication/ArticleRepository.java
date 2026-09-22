package com.example.myapplication;

import android.content.Context;

import java.util.ArrayList;

public class ArticleRepository {
    private static ArrayList<Article> articles;
    public static ArrayList<Article> getArticles(Context context){
        if (articles==null){
            articles=new ArrayList<>();

            articles.add(
                    new Article(
                            "Lorem Ipsum",
                            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec bibendum ullamcorper nunc, eget ullamcorper sapien ultrices ut. "
                                    + "dOrci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vel felis vel nunc facilisis accumsan in at ipsum. ",
                            "cover1",
                            0
                    )
            );

            articles.add(
                    new Article(
                            "One warm sunbeam, please.",
                            "Litter your copy with more kitty using this furrier alternative to Lorem Ipsum."
                                    + "Vacuum is the enemy. Purr, then bite. The moth is my sworn nemesis, my greatest sport, and, tragically, always slightly faster than me. Attack the feet. I fell off the sofa mid-stretch, and I would like it noted that this was an intentional artistic choice. "
                                    + "Cat ipsum dolor sit amet, demand food at dawn, ignore the food when it arrives, sit in the empty box the food came in, and judge you for the rest of the afternoon. There is food in the bowl, but it is old food. ",
                            "cover2",
                            0
                    )
            );

            articles.add(
                    new Article(
                            "Evanescia",
                            "Deals Physical DMG equal to 150%-330% of Evanescia's ATK to one designated enemy and Physical DMG equal to 75%-165% of Evanescia's ATK to adjacent targets. Additionally gains 10 Punchline. "
                                    + "Deals Physical DMG equal to 80%-176% of Evanescia's ATK to all enemy targets, then deals 5 instances of DMG, with each instance dealing Physical DMG equal to 72%-129.6% of Evanescia's ATK to one random enemy. "
                                    + "Evanescia gains Elation equal to 20% of CRIT DMG. When Evanescia gains Energy, she will simultaneously gain an equal amount of \"Certified Banger.\" When Evanescia gains \"Certified Banger,\" she will simultaneously gain an equal amount of Energy. The amount of \"Certified Banger\" taken into calculation via this method cannot exceed 100 points in a single instance. ",
                            "cover3",
                            0
                    )
            );

            articles.add(
                    new Article(
                            "Chatter at the birds. ",
                            "Chatter at window bird plot revenge groom aggressively fall asleep mid-groom. I have not been fed in approximately eleven minutes, and I am beginning to fear for my survival. Sit in box ignore box outside box knock box off shelf sleep. "
                                    + "The vacuum emerged from the cupboard, and I have relocated to the top of the wardrobe indefinitely. ",
                            "cover4",
                            0
                    )
            );

            articles.add(
                    new Article(
                            "Generated Cat Lorem Ipsum Text",
                            "I knocked the glass off the table while maintaining direct eye contact, because it was important you saw. "
                                    + "You bought me a bed, and I appreciate the gesture, but I will be sleeping in the sink. The paperwork is a bed. I climbed into the clean bag for life, and I now live in the bag for life, please plan accordingly. I meant to do that. The box is mine now.\n"
                                    + "Do not disturb the loaf. My tail moves independently and I take no responsibility for its opinions. ",
                            "cover5",
                            0
                    )
            );
        }
        return articles;
    }
    public static Article getArticle(
            Context context,
            int position) {
        return getArticles(context).get(position);
    }
}
