package creational.abstractFactory

import creational.abstractFactory.IFastFood.EType.*

class FastFoodFactory( type: IFastFood.EType ) {
    val factory = when (type) {
        COLOMBIANA -> ColombianFastFood()
        MEXICANA -> MexicanFastFood()
        ITALIANA -> ItalianFastFood()
    }
}