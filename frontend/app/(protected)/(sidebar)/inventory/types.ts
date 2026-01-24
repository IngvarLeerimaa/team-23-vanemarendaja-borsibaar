export interface InventoryItemDto {
  id: number;
  productId: number;
  productName: string;

  // string | number ?
  basePrice: number | string;
  minPrice: number | string;
  maxPrice: number | string;

  quantity: number | string;
  updatedAt: string; // ISO date string
}

export interface CategoryDto {
  id: number;
  name: string;
  dynamicPricing: boolean;
}

export type InventoryTransactionType = "PURCHASE" | "ADJUSTMENT" | "INITIAL";

export interface InventoryTransactionResponseDto {
  id: number;
  inventoryId: number;
  transactionType: InventoryTransactionType;
  quantityChange: number;
  quantityBefore: number;
  quantityAfter: number;
  referenceId?: string | null;
  notes?: string | null;
  createdBy: string;
  createdByName?: string | null;
  createdByEmail?: string | null;
  createdAt: string;
}
