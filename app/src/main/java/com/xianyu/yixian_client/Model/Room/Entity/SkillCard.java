package com.xianyu.yixian_client.Model.Room.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.xianyu.yixian_client.Model.Room.Convert.BuffConvert;

import java.util.ArrayList;

/**
 * @ProjectName: YiXian_Client
 * @Package: com.xianyu.yixian_client.Model.Room.Entity
 * @ClassName: SkillCard
 * @Description: java类作用描述
 * @Author: Jianxian
 * @CreateDate: 2021/1/8 20:25
 * @UpdateUser: Jianxian
 * @UpdateDate: 2021/1/8 20:25
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Entity(tableName = "skillcard")
public class SkillCard {
    @PrimaryKey
    long id;//卡牌ID-
    String name = "";//卡牌名字
    String description = "";//卡牌描述
    int mp;//释放卡牌所需消耗的仙气值
    int probability;//卡牌觉醒的概率
    int auxiliary_hp;//己方HP效果
    int auxiliary_mp;//己方MP效果
    int enemy_hp;//敌人HP效果
    int enemy_mp;//敌人MP效果
    long author_id;//作者ID-
    boolean magic;//是否魔法类
    boolean physics;//是否物理类
    boolean cure;//是否治疗类
    boolean attack;//是否攻击类
    boolean eternal;//是否永恒类
    long update;//卡牌最新版本-
    int max_enemy;//最大锁定敌人数 魂命
    int max_auxiliary;//最大锁定友军数 灵命
    @TypeConverters(BuffConvert.class)
    ArrayList<Buff> buffs = new ArrayList<>();
    public SkillCard(){

    }
    public ArrayList<Buff> getBuffs() {
        return buffs;
    }

    public void setBuffs(ArrayList<Buff> buffs) {
        this.buffs = buffs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    public int getAuxiliary_hp() {
        return auxiliary_hp;
    }

    public void setAuxiliary_hp(int auxiliary_hp) {
        this.auxiliary_hp = auxiliary_hp;
    }

    public int getAuxiliary_mp() { return auxiliary_mp; }

    public void setAuxiliary_mp(int auxiliary_mp) {
        this.auxiliary_mp = auxiliary_mp;
    }

    public int getEnemy_hp() {
        return enemy_hp;
    }

    public void setEnemy_hp(int enemy_hp) {
        this.enemy_hp = enemy_hp;
    }

    public int getEnemy_mp() {
        return enemy_mp;
    }

    public void setEnemy_mp(int enemy_mp) {
        this.enemy_mp = enemy_mp;
    }

    public long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(long author_id) {
        this.author_id = author_id;
    }

    public boolean isMagic() {
        return magic;
    }

    public void setMagic(boolean magic) {
        this.magic = magic;
    }

    public boolean isPhysics() {
        return physics;
    }

    public void setPhysics(boolean physics) {
        this.physics = physics;
    }

    public boolean isCure() {
        return cure;
    }

    public void setCure(boolean cure) {
        this.cure = cure;
    }

    public boolean isAttack() {
        return attack;
    }

    public void setAttack(boolean attack) {
        this.attack = attack;
    }

    public boolean isEternal() {
        return eternal;
    }

    public void setEternal(boolean eternal) {
        this.eternal = eternal;
    }

    public long getUpdate() {
        return update;
    }

    public void setUpdate(long update) {
        this.update = update;
    }

    public int getMax_enemy() {
        return max_enemy;
    }

    public void setMax_enemy(int max_enemy) {
        this.max_enemy = max_enemy;
    }

    public int getMax_auxiliary() {
        return max_auxiliary;
    }

    public void setMax_auxiliary(int max_auxiliary) {
        this.max_auxiliary = max_auxiliary;
    }
}
