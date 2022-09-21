public class MyColor implements ColorADT{
    private ColorsEnum colors;

    public MyColor(ColorsEnum s) {
        colors = s;
    }
    @Override
    public ColorsEnum mix(ColorsEnum color1, ColorsEnum color2) {
        // TODO Auto-generated method stub
        ColorsEnum smixColor;
        smixColor= ColorsEnum.RED;

        if(color1==ColorsEnum.RED){
            if(color2==ColorsEnum.YELLOW){
                smixColor=ColorsEnum.ORANGE;
            }
            else if(color2==ColorsEnum.BLUE){
                smixColor=ColorsEnum.VIOLET;
            }
        }

        if(color1==ColorsEnum.YELLOW){
            if(color2==ColorsEnum.RED){
                smixColor=ColorsEnum.ORANGE;
            }
            else if(color2==ColorsEnum.BLUE){
                smixColor=ColorsEnum.GREEN;
            }
        }

        if(color1==ColorsEnum.BLUE){
            if(color2==ColorsEnum.RED){
                smixColor=ColorsEnum.VIOLET;
            }
            else if(color2==ColorsEnum.YELLOW){
                smixColor=ColorsEnum.GREEN;
            }
        }
        return smixColor;
    }

    @Override
    public boolean primary(ColorsEnum color1) {
        // TODO Auto-generated method stub
        if(color1==ColorsEnum.RED || color1==ColorsEnum.BLUE || color1==ColorsEnum.YELLOW){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public ColorsEnum[] form(ColorsEnum color1) {
        // TODO Auto-generated method stub
        ColorsEnum[] sfColor = new ColorsEnum[2];
        sfColor[0]=ColorsEnum.RED;
        sfColor[1]=ColorsEnum.BLUE;

        if(color1==ColorsEnum.ORANGE){
            sfColor[0]=ColorsEnum.YELLOW;
            sfColor[1]=ColorsEnum.RED;
        }
        else if(color1==ColorsEnum.VIOLET){
            sfColor[0]=ColorsEnum.BLUE;
            sfColor[1]=ColorsEnum.RED;
        }
        else if(color1==ColorsEnum.GREEN){
            sfColor[0]=ColorsEnum.YELLOW;
            sfColor[1]=ColorsEnum.BLUE;
        }

        return sfColor;
    }

    @Override
    public ColorsEnum assign(ColorsEnum color2) {
        // TODO Auto-generated method stub
        colors = color2;
        return colors;
    }

}