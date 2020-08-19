import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args){
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play(){
        try{
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ,4);

            Track track = seq.createTrack();

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 2, 10, 0);
            MidiEvent noteO = new MidiEvent(first, 1);
            track.add(noteO);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 2, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn); 

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff); 
            
            player.setSequence(seq);

            player.start();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}