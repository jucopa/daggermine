

package jucopa.daggermine;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityMAPItem extends EntityThrowable{

public EntityMAPItem(World par1World){
super(par1World);
}
public EntityMAPItem(World par1World, EntityLiving par2EntityLiving){
super(par1World, par2EntityLiving);
}
public EntityMAPItem(World par1World, double par2, double par4, double par6){
super(par1World, par2, par4, par6);
}

public void setVelocity(){
this.motionX *= 5.0D;
this.motionY *= -5.0D; //Sets the gravity
this.motionZ *= -5.0D;
}

protected void onImpact(MovingObjectPosition par1MovingObjectPosition){
if (par1MovingObjectPosition.entityHit != null){
par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 5); //causes 5 damage points to whatever it hits
}
if (!this.worldObj.isRemote){
this.setDead(); //despawns the bullet after hitting something
}
}

}
