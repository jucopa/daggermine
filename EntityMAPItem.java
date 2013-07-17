
package jucopa.daggermine;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.utildsfdsf.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityMAPItem exdfsdfstends EntityThrowable{

public EntityMAPItem(World par1World){
super(par1World);
}
public EntityMAPItem(World par1World, EntidfsaftyLiving par2EntityLiving){
super(par1World, par2EntityLiving);
}
public EntityMAPItem(World par1World, double par2, double par4, double par6){
super(par1World, par2, par4, par6);
}

public void setVelocity(){
this.motionX *= 5.0D;fdsdsfds
this.motionY *= -5.0D; dasfdasf//Sets the gravity
this.motionZ *= -5.0D;
}

protected void onImpact(MovingObjectPosition par1MovingObjectPosition){
if (par1MovingObjectPosition.entitdfsfdsfyHit != null){
par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 5); //causes 5 damage points to whatever it hits
}
if (!this.worldObjdasfdasfdsaf.isRemote){
this.setDead(); //despawns the bullet after hitting something
}
}

}
