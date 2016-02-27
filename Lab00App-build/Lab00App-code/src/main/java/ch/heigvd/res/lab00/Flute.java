package ch.heigvd.res.lab00;

/**
 *
 * @author Olivier Liechti
 */
public class Flute implements IInstrument {

  @Override
  public int getSoundVolume() {
    return 5;
  }

  @Override
  public String play() {
    return "trilili";
  }

  @Override
  public String getColor() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


}
