package by.tc.task01.entity;

public class TabletPC extends Appliance {
	private int batteryCapacity;
	private int displayInches;
	private int memoryRom;
	private int flashMemoryCapasity;
	private String color;

	public TabletPC(int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapasity, String color) {
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryRom = memoryRom;
		this.flashMemoryCapasity = flashMemoryCapasity;
		this.color = color;
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryRom="
				+ memoryRom + ", flashMemoryCapasity=" + flashMemoryCapasity + ", color=" + color + "]";
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getFlashMemoryCapasity() {
		return flashMemoryCapasity;
	}

	public void setFlashMemoryCapasity(int flashMemoryCapasity) {
		this.flashMemoryCapasity = flashMemoryCapasity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batteryCapacity;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + displayInches;
		result = prime * result + flashMemoryCapasity;
		result = prime * result + memoryRom;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TabletPC other = (TabletPC) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (displayInches != other.displayInches)
			return false;
		if (flashMemoryCapasity != other.flashMemoryCapasity)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		return true;
	}

}
