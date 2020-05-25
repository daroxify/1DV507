package Exercise_7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import java.util.ArrayList;

public class NorseGodGUI extends Application {
    public void start(Stage primaryStage) {
        ArrayList<NorseGod> gods = new ArrayList<>();
        NorseGod Thor = new NorseGod("Thor", "Aesir",
                "Thor is a hammer-wielding god associated with thunder," +
                " lightning, storms, sacred groves and trees, strength, " +
                "the protection of mankind and also hallowing and fertility. \n" +
                "\nThor is a prominently mentioned god throughout the recorded history" +
                " of the Germanic peoples, from the Roman occupation of regions of Germania," +
                " to the tribal expansions of the Migration Period, to his high popularity during the Viking Age, when," +
                " in the face of the process of the Christianization of Scandinavia, emblems of his hammer, Mjölnir," +
                " were worn and Norse pagan personal names containing the name of the god bear witness to his popularity.");
        NorseGod Freya = new NorseGod("Freyja", "Vanir",
                "In Norse mythology, Freyja is a goddess associated love, beauty, fertility, gold, and seiðr." +
                        " Freyja is the owner of the necklace Brísingamen, rides a chariot pulled by two cats," +
                        " is accompanied by the boar Hildisvíni, and possesses a cloak of falcon feathers.\n" +
                        "\nBy her husband Óðr, she is the mother of two daughters, Hnoss and Gersemi. Along with her brother" +
                        " Freyr, her father Njörðr, and her mother, she is a member of the Vanir. Freyja rules over her" +
                        " heavenly field, Fólkvangr, where she receives half of those who die in battle.The other half go" +
                        " to the god Odin's hall, Valhalla.\n\nWithin Fólkvangr lies her hall, Sessrúmnir. Freyja assists other" +
                        " deities by allowing them to use her feathered cloak, is invoked in matters of fertility and love," +
                        " and is frequently sought after by powerful jötnar who wish to make her their wife. Freyja's husband," +
                        " the god Óðr, is frequently absent. She cries tears of red gold for him, and searches for him under " +
                        "assumed names.\n \nFreyja's name appears in numerous place names in Scandinavia, with a high concentration " +
                        "in southern Sweden. Various plants in Scandinavia once bore her name, but it was replaced with the name of " +
                        "the Virgin Mary during the process of Christianization.");
        NorseGod Loki = new NorseGod("Loki", "Giant",
                "Loki is a god in Norse mythology. Loki is in some sources the son of Fárbauti and Laufey, and the brother of Helblindi " +
                        "and Býleistr. By the jötunn Angrboða, Loki is the father of Hel, the wolf Fenrir, and the world serpent Jörmungandr." +
                        "\n\nLoki's relation with the gods varies by source; Loki sometimes assists the" +
                        " gods and sometimes behaves in a malicious manner towards them. Loki is a shape shifter and in separate incidents" +
                        " he appears in the form of a salmon, a mare, a fly, and possibly an elderly woman named Þökk (Old Norse 'thanks')." +
                        "\n\nLoki's positive relations with the gods end with his role in engineering the death of the god Baldr and Loki is" +
                        " eventually bound by Váli with the entrails of one of his sons.");
        NorseGod Odin = new NorseGod("Odin", "Aesir",
                "Odin is a widely revered god in Germanic mythology. Norse mythology," +
                        " the source of most surviving information about him, associates Odin with wisdom, healing, death, royalty, the gallows," +
                        " knowledge, war, battle, victory, sorcery, poetry, frenzy, and the runic alphabet, and portrays him as the husband of the" +
                        " goddess Frigg.\n\nOld Norse texts portray Odin as one-eyed and long-bearded, frequently wielding a spear named Gungnir and" +
                        " wearing a cloak and a broad hat.\n\nHe is often accompanied by his animal companions and familiars—the wolves Geri and Freki" +
                        " and the ravens Huginn and Muninn, who bring him information from all over Midgard—and rides the flying, eight-legged steed" +
                        " Sleipnir across the sky and into the underworld. Odin is the son of Bestla and Borr and has two brothers, Vili and Vé.");
        NorseGod Freyr = new NorseGod("Freyr", "Vanir",
                "Freyr (Old Norse: Lord), sometimes anglicized as Frey, is a widely attested god in Norse mythology, associated with sacral" +
                        " kingship, battle, virility, peace and prosperity, with sunshine and fair weather, and with good harvest.\n\nFreyr, sometimes " +
                        "referred to as Yngvi-Freyr, was especially associated with Sweden and seen as an ancestor of the Swedish royal house. According" +
                        " to Adam of Bremen, Freyr was associated with peace and pleasure, and was represented with a phallic statue in the Temple at Uppsala." +
                        "\n\nAccording to Snorri Sturluson, Freyr was \"the most renowned of the æsir\", and was venerated for good harvest and peace." +
                        " In the mythological stories in the Icelandic books, Freyr is presented as one of the Vanir, the son of the sea god Njörðr," +
                        " or Njord, as well as the twin brother of the goddess Freyja.  Freyr is also known to have been associated with the horse cult." +
                        " He also kept sacred horses in his sanctuary at Thrandheim in Norway.");
        NorseGod Tyr = new NorseGod("Tyr", "Aesir",
                "Týr is a god in Germanic mythology. Stemming from the Proto-Germanic deity Tīwaz and ultimately from the Proto-Indo-European chief deity " +
                        " *Dyeus, little information about the god survives beyond Old Norse sources.\n\nDue to the etymology of the god's name and the shadowy presence" +
                        " of the god in the extant Germanic corpus, some scholars propose that Týr may have once held a more central place among the deities of early " +
                        "Germanic mythology.\n\nIn Norse mythology, from which most surviving narratives about gods among the Germanic peoples stem, Týr sacrifices his arm" +
                        " to the monstrous wolf Fenrir, who bites off his limb while the gods bind the animal. Týr is foretold to be consumed by the similarly monstrous " +
                        "dog Garmr during the events of Ragnarök.\n\nIn Old Norse sources, Týr is alternately described as the son of the jötunn Hymir (in Hymiskviða) or of the " +
                        "god Odin (in Skáldskaparmál).Various place names in Scandinavia refer to the god, and a variety of objects found in England and Scandinavia may depict " +
                        "the god or invoke him. ");
        NorseGod Hel = new NorseGod("Hel", "Giant",
                "In Norse mythology, Hel is a being who presides over a realm of the same name, where she receives a portion of the dead. In the Poetic Edda, Prose Edda, and " +
                        "Heimskringla, Hel is referred to as a daughter of Loki.\n\nIn the Prose Edda book Gylfaginning, Hel is described as having been appointed by the god Odin as " +
                        "ruler of a realm of the same name, located in Niflheim. In the same source, her appearance is described as half blue and half flesh-coloured and further as " +
                        "having a gloomy, downcast appearance.\n\nThe Prose Edda details that Hel rules over vast mansions with many servants in her underworld realm and plays a key role " +
                        "in the attempted resurrection of the god Baldr.\n\nScholarly theories have been proposed about Hel's potential connections to figures appearing in the 11th-century " +
                        "Old English Gospel of Nicodemus and Old Norse Bartholomeus saga postola, that she may have been considered a goddess with potential Indo-European parallels in Bhavani, " +
                        "Kali, and Mahakali or that Hel may have become a being only as a late personification of the location of the same name.  ");
        NorseGod Njord = new NorseGod("Njord", "Vanir",
                "Njord is one of the principal gods of the Vanir tribe of deities. He’s also an honorary member of the Aesir gods, having been sent to them during the Aesir-Vanir War along " +
                        "with his son, Freyr, and his daughter, Freya. Freyr and Freya’s mother is Njord’s unnamed sister, who, based on linguistic evidence, is probably Nerthus or an equivalent " +
                        "goddess.\n\nNjord was particularly associated with wealth, fertility, the sea, and seafaring in the Vikings’ religion. A saying among the Norse peoples held especially wealthy " +
                        "people to be “as rich as Njord.” \n\nThe tale in which Njord features most prominently is The Marriage of Njord and Skadi. Skadi, a giantess, had come to the Aesir seeking restitution " +
                        "for the slaying of her father. As part of the settlement, they agreed that she could have any of the gods she desired as her husband. She chose Njord by mistake, thinking him to be Baldur." +
                        "\n\nTheir marriage was short and unpleasant. Half of their time was spent in Skadi’s home in the snowy mountains, which Njord couldn’t tolerate; the other half was spent in Njord’s home, Nóatún " +
                        "(“The Place of Ships”), which was located on the beach. Skadi couldn’t tolerate Njord’s home, either, so the two parted ways. ");
        gods.add(Thor);
        gods.add(Freya);
        gods.add(Loki);
        gods.add(Odin);
        gods.add(Freyr);
        gods.add(Tyr);
        gods.add(Hel);
        gods.add(Njord);

        BorderPane pane = new BorderPane();

        ListView<String> listOfGods = new ListView<>();
        listOfGods.setPrefSize(150, 100);
        listOfGods.getItems().addAll(
                gods.get(0).getName(),
                gods.get(1).getName(),
                gods.get(2).getName(),
                gods.get(3).getName(),
                gods.get(4).getName(),
                gods.get(5).getName(),
                gods.get(6).getName(),
                gods.get(7).getName()
        );

        listOfGods.getSelectionModel().selectedIndexProperty().
                addListener(e -> {
                    if(listOfGods.getSelectionModel().getSelectedIndex() == 0){
                        Text text_1 = new Text(gods.get(0).getName());
                        Text text11 = new Text("\n" +gods.get(0).getRace() +"\n");
                        Text text1info = new Text("\n" +gods.get(0).getDesc());
                        text_1.setStyle("-fx-font-weight: bold");
                        text11.setStyle("-fx-font-style: italic");
                        TextFlow text1 = new TextFlow();
                        text1.getChildren().addAll(text_1,text11,text1info);
                        ScrollPane s1 = new ScrollPane();
                        s1.setContent(text1);
                        s1.setFitToWidth(true);
                        pane.setCenter(s1);
                    } else if (listOfGods.getSelectionModel().getSelectedIndex() == 1){
                        Text text_2 = new Text(gods.get(1).getName());
                        Text text21 = new Text("\n" +gods.get(1).getRace() +"\n");
                        Text text2info = new Text("\n"+gods.get(1).getDesc());
                        ScrollPane s2 = new ScrollPane(); // adding a scrollpane
                        text_2.setStyle("-fx-font-weight: bold");
                        text21.setStyle("-fx-font-style: italic");
                        TextFlow text2 = new TextFlow();
                        text2.getChildren().addAll(text_2, text21,text2info);
                        s2.setContent(text2); // set text2 as content of scrollpane
                        s2.setFitToWidth(true); // we set fit to witdh because we want
                        pane.setCenter(s2); // to scroll up/down and not to the side.
                    } else if (listOfGods.getSelectionModel().getSelectedIndex() == 2){
                        Text text_3 = new Text(gods.get(2).getName());
                        Text text31 = new Text("\n"+gods.get(2).getRace() +"\n");
                        Text text3info = new Text("\n" +gods.get(2).getDesc());
                        text_3.setStyle("-fx-font-weight: bold");
                        text31.setStyle("-fx-font-style: italic");
                        TextFlow text3 = new TextFlow();
                        text3.getChildren().addAll(text_3,text31, text3info);
                        ScrollPane s3 = new ScrollPane();
                        s3.setContent(text3);
                        s3.setFitToWidth(true);
                        pane.setCenter(s3);
                    } else if (listOfGods.getSelectionModel().getSelectedIndex() == 3){
                        Text text_4 = new Text(gods.get(3).getName());
                        Text text41 = new Text("\n" + gods.get(3).getRace() +"\n");
                        Text text4info = new Text("\n" +gods.get(3).getDesc());
                        text_4.setStyle("-fx-font-weight: bold");
                        text41.setStyle("-fx-font-style: italic");
                        TextFlow text4 = new TextFlow();
                        text4.getChildren().addAll(text_4, text41,text4info);
                        ScrollPane s4 = new ScrollPane();
                        s4.setContent(text4);
                        s4.setFitToWidth(true);
                        pane.setCenter(s4);
                    } else if (listOfGods.getSelectionModel().getSelectedIndex() == 4){
                        Text text_5 = new Text(gods.get(4).getName());
                        Text text51 = new Text("\n" + gods.get(4).getRace() +"\n");
                        Text text5info = new Text("\n"+gods.get(4).getDesc());
                        text_5.setStyle("-fx-font-weight: bold");
                        text51.setStyle("-fx-font-style: italic");
                        TextFlow text5 = new TextFlow();
                        text5.getChildren().addAll(text_5,text51,text5info);
                        ScrollPane s5 = new ScrollPane();
                        s5.setFitToWidth(true);
                        s5.setContent(text5);
                        pane.setCenter(s5);
                    } else if (listOfGods.getSelectionModel().getSelectedIndex() == 5){
                        Text text_6 = new Text(gods.get(5).getName());
                        Text text61 = new Text("\n" +gods.get(5).getRace()+"\n");
                        Text text6info = new Text("\n" +gods.get(5).getDesc());
                        text_6.setStyle("-fx-font-weight: bold"); // found this onhttps://stackoverflow.com/questions/12341672/make-portion-of-a-text-bold-in-a-javafx-label-or-text
                        text61.setStyle("-fx-font-style: italic");
                        TextFlow text6 = new TextFlow();
                        text6.getChildren().addAll(text_6, text61, text6info);
                        ScrollPane s6 = new ScrollPane();
                        s6.setContent(text6);
                        s6.setFitToWidth(true);
                        pane.setCenter(s6);

                    } else if (listOfGods.getSelectionModel().getSelectedIndex() == 6){
                        Text text_7 = new Text(gods.get(6).getName());
                        Text text71 = new Text("\n" + gods.get(6).getRace() +"\n");
                        Text text7info = new Text("\n"+gods.get(6).getDesc());
                        text_7.setStyle("-fx-font-weight: bold");
                        text71.setStyle("-fx-font-style: italic");
                        TextFlow text7 = new TextFlow();
                        text7.getChildren().addAll(text_7, text71, text7info);
                        ScrollPane s7 = new ScrollPane();
                        s7.setContent(text7);
                        s7.setFitToWidth(true);
                        pane.setCenter(s7);

                    } else if (listOfGods.getSelectionModel().getSelectedIndex() == 7){
                        Text text_8 = new Text(gods.get(7).getName());
                        Text text81 = new Text("\n"+gods.get(7).getRace()+"\n");
                        Text text8info = new Text("\n"+gods.get(7).getDesc());
                        text_8.setStyle("-fx-font-weight: bold");
                        text81.setStyle("-fx-font-style: italic");
                        TextFlow text8 = new TextFlow();
                        text8.getChildren().addAll(text_8, text81, text8info);
                        ScrollPane s8 = new ScrollPane();
                        s8.setContent(text8);
                        s8.setFitToWidth(true);
                        pane.setCenter(s8);
                    }
                });
        Text text = new Text();
        text.setText("Norse Gods and other Beings");
        text.setFont(Font.font(30));
        pane.setTop(text);
        pane.setLeft(listOfGods);
        Scene scene = new Scene(pane, 600, 400);
        primaryStage.setTitle("Norse Gods");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
