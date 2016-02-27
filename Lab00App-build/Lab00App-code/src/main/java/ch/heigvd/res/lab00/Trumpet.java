package ch.heigvd.res.lab00;

/**
 *
 * @author Olivier Liechti
 */
public class Trumpet implements IInstrument {

  @Override
  public int getSoundVolume() {
    return 10;
  }

  @Override
  public String play() {
    return "pouet";
  }

  @Override
  public String getColor() {
    return "golden";
  }


}
