package scene;

import scene.model.Action.Action;
import scene.model.Action.list.*;
import scene.model.Creatures.Creature;
import scene.model.Creatures.list.MumiTroll;
import scene.model.Creatures.list.Snusmumrik;
import scene.model.Enums.BindWords;
import scene.model.Enums.Punctuation;
import scene.model.Enums.State;
import scene.model.Place.list.House;
import scene.model.Place.list.Shore;
import scene.model.Place.list.Travelling;
import scene.model.Qualifers.list.*;
import scene.model.Things.list.*;


public class MyScene extends Scene {
    private final TextBuilder history = TextBuilder.getInstance();
    Creature snusmumrik = Snusmumrik.getInstance();
    Creature mumitroll = MumiTroll.getInstance();



    @Override
    public String build() {
        history.add(snusmumrik.getName(), snusmumrik.action(new NotReturning()), Punctuation.DOT.getPunct());

        history.add(BindWords.IN_SUCH.getBindWord(), State.GEN_NIGHT.getState(), snusmumrik.getGender().getPrefix())
                .add(snusmumrik.qualify(new Often()), snusmumrik.action(new Warder()))
                .add(BindWords.WITH_HIS.getBindWord())
                .add(snusmumrik.instCaseThingName(new Harmon()), Punctuation.DOT.getPunct());

        history.add(BindWords.NO.getBindWord(), BindWords.IN_THIS.getBindWord(), State.NIGHT.getState())
                .add(BindWords.HIS.getBindWord(), snusmumrik.genPlurThingName(new Song()), BindWords.NOT.getBindWord())
                .add(snusmumrik.action(new Was()), snusmumrik.qualify(new CanHear()), Punctuation.DOT.getPunct());

        history.add(BindWords.MAYBE.getBindWord(), Punctuation.COMMA.getPunct(), snusmumrik.getGender().getPrefix())
                .add(snusmumrik.action(new Go()))
                .add(BindWords.IN_LOWER.getBindWord(), snusmumrik.getDestionation(new Travelling()), Punctuation.COMMA.getPunct())
                .add(snusmumrik.action(new MakeSomething()), snusmumrik.plurThingName(new Discovery()))
                .add(Punctuation.DOT.getPunct());

        history.add(snusmumrik.qualify(new Soon()), snusmumrik.getGender().getPrefix(), snusmumrik.action(new MakeShelter()))
                .add(BindWords.ON.getBindWord(), snusmumrik.getPrepDestionation(new Shore()), snusmumrik.genCaseThingName(new Shelter()))
                .add(BindWords.AND.getBindWord(), snusmumrik.qualify(new Completely()), snusmumrik.action(new Stop()))
                .add(snusmumrik.action(new SleepHome()), String.join("", snusmumrik.getGenDestionation(new House()), Punctuation.ELLIPSIS.getPunct()));

        history.add(mumitroll.getName(), mumitroll.action(new Breathe()), Punctuation.DOT.getPunct());

        history.add(BindWords.TO_HIM.getBindWord(), mumitroll.action(new Was()), mumitroll.qualify(new SoSad()))
                .add(Punctuation.COMMA.getPunct(), BindWords.ALTHOUGH.getBindWord(), mumitroll.action(new NoThink()))
                .add(mumitroll.action(new Was()), BindWords.NOT_SOME.getBindWord(), Punctuation.DOT.getPunct());

        history.add(BindWords.HERE.getBindWord(), BindWords.UNDER.getBindWord(), mumitroll.instCaseThingName(new Window()))
                .add(mumitroll.action(new HearSound()), mumitroll.qualify(new Quiet()), mumitroll.thing(new Whistle()))
                .add(Punctuation.COMMA.getPunct(), BindWords.AND.getBindWord(), mumitroll.thing(new Heart()))
                .add(mumitroll.getGenName(), BindWords.SO_AND.getBindWord(), mumitroll.action(new Jump()))
                .add(mumitroll.qualify(new Happiness()), Punctuation.DOT.getPunct());

        history.add(mumitroll.getGender().getPrefix().substring(0,1).toUpperCase() + mumitroll.getGender().getPrefix().substring(1))
                .add(mumitroll.qualify(new NoFast()), mumitroll.action(new Come()), BindWords.TO.getBindWord())
                .add(mumitroll.datCaseThingName(new Window()), BindWords.AND.getBindWord(), mumitroll.action(new LookAround()))
                .add(Punctuation.DOT.getPunct());

        history.add(mumitroll.thing(new Whistle()).substring(0,1).toUpperCase() + mumitroll.thing(new Whistle()).substring(1))
                .add(String.join("", mumitroll.action(new Mean()), Punctuation.COLON.getPunct()), mumitroll.qualify(new TopSecret()))
                .add(Punctuation.EXCL_POINT.getPunct());

        history.add(BindWords.BOTTOM.getBindWord(), BindWords.NEAR.getBindWord(), mumitroll.genCaseThingName(new Stair()))
                .add(snusmumrik.action(new Stay()), snusmumrik.getName(), Punctuation.DOT.getPunct());















        return history.getResult();
    }


}
